package manfred.exercises.design.other.blackboard.v2.pacemaker;

import manfred.exercises.design.other.blackboard.v2.blackboard.Blackboard;
import manfred.exercises.design.other.blackboard.v2.blackboard.KnowledgeSource;

import java.util.List;

/**
 * 心率计算器，黑板模式中的知识源之一。
 * 根据黑板上的心跳时间戳列表计算患者每分钟心跳次数（BPM），并将结果写入黑板。
 */
public class BpmCalculator implements KnowledgeSource {

    @Override
    public void updateBlackboard() {
        List<Long> timeStamps = Blackboard.getTimeStamps();
        // Set bpm to zero if there are not enough datapoints to calculate it
        // Otherwise, calculate bpm by counting the number of datapoints in
        // timeStamps array, and dividing by the total elapsed time of the first
        // point and the last point in the array(making sure to convert from milliseconds to
        // minutes first).
        if (timeStamps.size() < 2) {
            Blackboard.setBpm((long) 0);
        } else {
            Long elapsedTime;
            Long startTime = timeStamps.get(0);
            Long endTime = timeStamps.get(timeStamps.size() - 1);
            elapsedTime = endTime - startTime;

            Long bpm = (timeStamps.size() * 60 * 1000) / elapsedTime;

            Blackboard.setBpm(bpm);
        }
    }

    @Override
    public void activateController() {
        // TODO Auto-generated method stub

    }

}
