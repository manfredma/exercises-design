package manfred.exercises.design.other.blackboard.v2.blackboard;

import manfred.exercises.design.other.blackboard.v2.pacemaker.ActivityStatusCalculator;
import manfred.exercises.design.other.blackboard.v2.pacemaker.BpmCalculator;
import manfred.exercises.design.other.blackboard.v2.pacemaker.PulseStatusCalculator;

/**
 * 黑板控制器，定义各知识源与黑板交互的顺序。
 * 当前采用简单的顺序执行策略，依次让各知识源更新黑板内容。
 */
public class BlackboardController {

    private static final BpmCalculator bpm = new BpmCalculator();

    private static final PulseStatusCalculator pulseStatus = new PulseStatusCalculator();

    private static final ActivityStatusCalculator activityStatus = new ActivityStatusCalculator();

    // Loop through the following knowledge sources and have them update the
    // knowledge written on the Blackboard.
    public static void loop() {
        bpm.updateBlackboard();
        pulseStatus.updateBlackboard();
        activityStatus.updateBlackboard();
    }
}
