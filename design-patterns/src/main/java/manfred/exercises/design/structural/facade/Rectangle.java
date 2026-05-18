package manfred.exercises.design.structural.facade;

/**
 * 外观模式 - 矩形，形状接口的具体实现。
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
