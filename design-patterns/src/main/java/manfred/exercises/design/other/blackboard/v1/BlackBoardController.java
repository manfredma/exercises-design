package manfred.exercises.design.other.blackboard.v1;

import java.util.List;
import java.util.Observer;
import java.util.concurrent.ExecutorService;

/**
 * 黑板控制器接口，负责协调知识源与黑板之间的交互。
 * 实现 Observer 接口，在黑板状态变化时接收通知。
 */
public interface BlackBoardController extends Observer {

    void setKnowledgeSourceList(List<KnowledgeSource> ksList);

    void enrollKnowledgeSource(KnowledgeSource ks, ExecutorService exsvc);

    void execOutcome(BlackBoardObject bbo);

}
