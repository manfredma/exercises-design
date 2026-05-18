package manfred.exercises.design.other.blackboard.v2.pacemaker;

import manfred.exercises.design.other.blackboard.v2.blackboard.Blackboard;
import manfred.exercises.design.other.blackboard.v2.blackboard.KnowledgeSource;

import java.util.List;

/**
 * 脉搏状态计算器，黑板模式中的知识源之一。
 * 负责判断患者心跳是否规律，并将脉搏状态（正常/心律不齐/未知）写入黑板。
 */
public class PulseStatusCalculator implements KnowledgeSource {


    @Override
    public void updateBlackboard() {
        // Return unknown if there are not enough datapoints to calculate the
        // heart's pulse status
        List<Long> timeStamps = Blackboard.getTimeStamps();
        if (timeStamps.size() < 3) {
            Blackboard.setPulseStatus("Unknown");
            return;
        }

        Long time1 = timeStamps.get(timeStamps.size() - 3);
        Long time2 = timeStamps.get(timeStamps.size() - 2);
        Long time3 = timeStamps.get(timeStamps.size() - 1);

        // Prevents the pulse status from returning "Arrhythmic" when the timestamps
        // array fails to log a heart pulse since the sensor crashed
        if (Blackboard.getSensorDown() != null) {
            if (time1 < Blackboard.getSensorDown() && time3 > Blackboard.getSensorUp()) {
                Blackboard.setPulseStatus("Unknown");
                return;
            }

        }

        Long baseline = time2 - time1;
        Long comparison = time3 - time2;
        if (comparison > baseline * 1.5 || comparison < baseline / 1.5) {
            Blackboard.setPulseStatus("Arrhythmic");
        } else {
            Blackboard.setPulseStatus("Normal");
        }

    }

    @Override
    public void activateController() {
        // TODO Auto-generated method stub

    }
}
