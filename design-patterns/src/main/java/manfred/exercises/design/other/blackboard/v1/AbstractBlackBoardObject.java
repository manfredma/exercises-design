package manfred.exercises.design.other.blackboard.v1;

/**
 * 黑板对象抽象类，实现 BlackBoardObject 接口。
 * 维护知识单元的就绪状态标识。
 */
public abstract class AbstractBlackBoardObject implements BlackBoardObject {

    protected boolean isReady;

    @Override
    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean isReady) {
        this.isReady = isReady;
    }

}
