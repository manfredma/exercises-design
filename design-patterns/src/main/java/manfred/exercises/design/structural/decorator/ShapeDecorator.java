package manfred.exercises.design.structural.decorator;

/**
 * 装饰器模式 - 抽象装饰器类，持有形状引用并委托调用。
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
