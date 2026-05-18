package manfred.exercises.design.creational.abstractfactory;

/**
 * 抽象工厂，定义创建形状和颜色对象的接口。
 */
public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape);
}
