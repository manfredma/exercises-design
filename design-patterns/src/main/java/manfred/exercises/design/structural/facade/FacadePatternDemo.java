package manfred.exercises.design.structural.facade;

/**
 * 外观模式演示 - 展示通过外观类简化子系统调用的使用方式。
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
