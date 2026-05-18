package manfred.exercises.design.other.blackboard.v2.pacemaker;

import manfred.exercises.design.other.blackboard.v2.blackboard.Blackboard;
import manfred.exercises.design.other.blackboard.v2.blackboard.BlackboardController;
import manfred.exercises.design.other.blackboard.v2.blackboard.KnowledgeSource;
import manfred.exercises.design.other.blackboard.v2.heartbeat.HeartbeatSender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 起搏器传感器，模拟附着在心脏上并检测心跳脉冲的传感器。
 * 同时作为黑板模式中的知识源，将检测到的心跳时间戳写入黑板。
 * 通过心跳战术（HeartbeatSender）保障自身高可用性。
 */
public class PacemakerSensor extends Thread implements KnowledgeSource {
    //Port to be used for pacemaker sensor to read user's heart rate
    private static final int pacemakerPort = 4444;

    //The interval at which a heartbeat message will be sent in milliseconds
    private static final int sendingInterval = 1000;

    // Name of the sensor so we can keep track of the active sensor
    private final String sensorName;

    public PacemakerSensor(String name) {
        sensorName = name;
    }

    protected static long getSendingInterval() {
        return sendingInterval;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void run() {
        //Start a heartbeat sender on a separate thread so that we don't run into issues where
        //the main thread can block the sending of the heartbeat and mistake this process for dead
        Thread heartbeatSender = new Thread(new HeartbeatSender(sendingInterval));
        heartbeatSender.start();

        //Start a server socket to continually check for and receive incoming heart rate data
        try (ServerSocket serverSocket = new ServerSocket(pacemakerPort, 1)) {
            System.out.println("Pacemaker sensor is now online.");
            int count = 10;
            while (true) {
                try (
                        Socket clientSocket = serverSocket.accept();
                        BufferedReader in =
                                new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
                ) {
                    String heartRateSignal;
                    while ((heartRateSignal = in.readLine()) != null) {
                        System.out.println("Pulse detected by " + getSensorName() + " sensor.");

                        updateBlackboard();

                        // This code artificially injects a fault which causes the sensor to fail
                        // after 10 iterations through this loop.
                        int breaker = count / count;
                        count--;
                    }
                } catch (IOException e) {
                    System.err.println("Heart was disconnected!");
                }

            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Caught the injected math error.");
        } finally {
            System.err.println("Sensor crashed!");

            // Causes the heartbeat sender thread to stop when we encounter an error with the sensor
            heartbeatSender.interrupt();
        }
    }

    @Override
    public void updateBlackboard() {
        Blackboard.updateTimeStamps(System.currentTimeMillis());
        activateController();
    }

    @Override
    public void activateController() {
        BlackboardController.loop();
    }
}
