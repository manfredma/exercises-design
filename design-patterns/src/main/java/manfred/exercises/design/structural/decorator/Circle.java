package manfred.exercises.design.structural.decorator;

/**
 * 装饰器模式 - 圆形，实现形状接口的具体类。
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
