package manfred.exercises.design.other.blackboard.v1;

/**
 * 知识源接口，代表能够向黑板贡献知识的独立处理单元。
 * 实现 Runnable 接口，支持在线程池中异步执行。
 */
public interface KnowledgeSource extends Runnable {

    boolean canHandle(BlackBoardObject bbo, BlackBoard bb);

    BlackBoardObject process(BlackBoardObject bbo) throws Exception;

    void updateBlackBoardObject(BlackBoardObject bbo);

}
