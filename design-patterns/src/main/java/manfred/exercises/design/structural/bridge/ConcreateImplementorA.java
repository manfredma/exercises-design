package manfred.exercises.design.structural.bridge;

/**
 * 桥接模式 - 具体实现类A，实现了实现接口中的操作方法。
 */
public class ConcreateImplementorA implements Implementor {
    @Override
    public void operation() {
        System.out.println("this is concreteImplementorA's operation...");
    }
}
