package manfred.exercises.design.structural.bridge;

/**
 * 桥接模式演示 - 展示桥接模式将抽象与实现分离的使用方式。
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();
        // 调用第一个实现类
        abstraction.setImplementor(new ConcreateImplementorA());
        abstraction.operation();

        // 调用第二个实现类
        abstraction.setImplementor(new ConcreateImplementorB());
        abstraction.operation();
    }
}
