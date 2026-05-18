package manfred.exercises.design.structural.facade;

/**
 * 外观模式 - 正方形，形状接口的具体实现。
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
