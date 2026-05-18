package manfred.exercises.design.structural.facade;

/**
 * 外观模式 - 圆形，形状接口的具体实现。
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
