package manfred.exercises.design.behavioral.observer;

/**
 * 观察者抽象基类，持有被观察主题的引用并定义更新方法。
 */
public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}
