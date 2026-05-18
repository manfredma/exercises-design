package manfred.exercises.design.structural.bridge;

/**
 * 桥接模式 - 精化抽象类，扩展抽象类的功能。
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    protected void operation() {
        super.getImplementor().operation();
    }
}
