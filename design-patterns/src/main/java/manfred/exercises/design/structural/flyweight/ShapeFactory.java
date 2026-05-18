package manfred.exercises.design.structural.flyweight;

import java.util.HashMap;

/**
 * 享元模式 - 形状工厂，通过缓存复用已创建的圆形享元对象。
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
