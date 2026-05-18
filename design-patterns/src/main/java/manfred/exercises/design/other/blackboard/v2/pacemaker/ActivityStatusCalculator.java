package manfred.exercises.design.other.blackboard.v2.pacemaker;

import manfred.exercises.design.other.blackboard.v2.blackboard.Blackboard;
import manfred.exercises.design.other.blackboard.v2.blackboard.KnowledgeSource;

/**
 * 活动状态计算器，黑板模式中的知识源之一。
 * 根据患者心率（BPM）判断其心脏工作强度，并将活动级别写入黑板。
 */
public class ActivityStatusCalculator implements KnowledgeSource {

    @Override
    public void updateBlackboard() {
        Long bpm = Blackboard.getBpm();
        if (bpm <= 80) {
            Blackboard.setActivityLevel("Resting");
            return;
        }

        if (bpm > 80 && bpm <= 150) {
            Blackboard.setActivityLevel("Moderate Activity");
            return;
        }

        if (bpm > 150 && bpm <= 200) {
            Blackboard.setActivityLevel("Intense Activity");
            return;
        }

        if (bpm > 200) {
            Blackboard.setActivityLevel("Danger!");
            return;
        }
    }

    @Override
    public void activateController() {
        // TODO Auto-generated method stub

    }

}
