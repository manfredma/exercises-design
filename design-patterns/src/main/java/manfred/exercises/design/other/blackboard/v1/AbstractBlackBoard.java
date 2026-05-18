package manfred.exercises.design.other.blackboard.v1;

import java.util.Observable;

/**
 * 黑板抽象类，实现 BlackBoard 接口并继承 Observable。
 * 当新的黑板对象加入时，通知所有已注册的控制器观察者。
 */
public abstract class AbstractBlackBoard extends Observable implements BlackBoard {

    @Override
    public void addBlackBoardObject(BlackBoardObject bbo) {

        setChanged();
        notifyController(bbo);
    }

    @Override
    public void notifyController(BlackBoardObject bbo) {
        notifyObservers(bbo);
    }
}
