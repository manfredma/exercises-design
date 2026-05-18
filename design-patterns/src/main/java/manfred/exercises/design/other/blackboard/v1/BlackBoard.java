package manfred.exercises.design.other.blackboard.v1;

/**
 * 黑板模式中的黑板接口，定义知识存储的核心操作。
 * 负责接收黑板对象并通知控制器。
 */
public interface BlackBoard {

    void addBlackBoardObject(BlackBoardObject bbo);

    void notifyController(BlackBoardObject bbo);
}
