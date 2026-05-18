package manfred.exercises.design.other.blackboard.v2.heartbeat;

/**
 * 心跳发送器，心跳战术中负责向心跳接收器定期发送存活信号。
 * 通过周期性发送当前时间戳来证明自身正常运行。
 */
public class HeartbeatSender implements Runnable {

    private final int sendingInterval;

    public HeartbeatSender(int sendingInterval) {
        this.sendingInterval = sendingInterval;
    }

    public void sendHeartBeat() {
        long currentTime = System.currentTimeMillis();
        HeartbeatReceiver.updateTime(currentTime);
    }

    @Override
    public void run() {
        // Send a heartbeat signal to heartbeat receiver at the sending interval
        while (true) {
            try {
                sendHeartBeat();
                Thread.sleep(sendingInterval);
            } catch (InterruptedException e) {
                System.err.println("Heartbeat sender appears to have crashed.");
                break;
            }
        } // End While
    }
}
