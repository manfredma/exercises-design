package manfred.exercises.design.other.blackboard.v1;

/**
 * 知识源抽象类，实现 KnowledgeSource 接口。
 * 封装知识源的通用处理流程：处理黑板对象后将结果写回黑板。
 */
public abstract class AbstractKnowledgeSource implements KnowledgeSource {

    protected BlackBoardObject bbo;

    protected BlackBoard bb;

    @Override
    public void run() {
        try {
            updateBlackBoardObject(process(bbo));
        } catch (Exception ex) {
            //TODO: log the exception
        }
    }

    @Override
    public void updateBlackBoardObject(BlackBoardObject bbo) {
        bb.addBlackBoardObject(bbo);
    }
}
