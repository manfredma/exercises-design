package manfred.exercises.design.structural.decorator;

/**
 * 装饰器模式 - 矩形，实现形状接口的具体类。
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
