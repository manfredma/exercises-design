package manfred.exercises.design.structural.decorator;

/**
 * 装饰器模式演示 - 展示动态为对象添加职责的装饰器模式用法。
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(circle);
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
