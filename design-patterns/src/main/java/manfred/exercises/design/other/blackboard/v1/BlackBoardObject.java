package manfred.exercises.design.other.blackboard.v1;

/**
 * 黑板对象接口，表示存储在黑板上的知识单元。
 * 通过 isReady 标识该知识单元是否已处理完毕。
 */
public interface BlackBoardObject {

    boolean isReady();

}
