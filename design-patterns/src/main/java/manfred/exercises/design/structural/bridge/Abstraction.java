package manfred.exercises.design.structural.bridge;

/**
 * 桥接模式 - 抽象类，持有实现接口的引用，将抽象与实现分离。
 */
public abstract class Abstraction {
    private Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    protected void operation() {
        implementor.operation();
    }
}
