package manfred.exercises.design.other.blackboard.v2.heartbeat;

import manfred.exercises.design.other.blackboard.v2.pacemaker.PacemakerController;

/**
 * 故障监控器，负责接收并处理心跳接收器发现的错误。
 * 在检测到心跳发送方宕机时，触发起搏器控制器的恢复流程。
 */
public class FaultMonitor {

    public static void notify(String errorMessage) {
        switch (errorMessage) {
            case "Heartbeat sender is dead":
                System.err.println("Fault monitor: Heartbeat sender dead status received. " +
                        "Initiating recovery mode...");
                PacemakerController.initiateRecovery();
                PacemakerController.updateGUI();
                break;
        }
    }


}
