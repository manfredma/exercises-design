package manfred.exercises.design.other.blackboard.v2.blackboard;

/**
 * 知识源接口，定义知识源对象可用的方法。
 * 知识源负责与黑板交互，并在需要时通知黑板控制器执行后续操作。
 */
public interface KnowledgeSource {

    void updateBlackboard();

    void activateController();
}
