package manfred.exercises.design.structural.bridge;

/**
 * 桥接模式 - 具体实现类B，实现了实现接口中的操作方法。
 */
public class ConcreateImplementorB implements Implementor {
    @Override
    public void operation() {
        System.out.println("this is concreteImplementorB's operation...");
    }
}
