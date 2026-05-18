package manfred.exercises.design.creational.factory;

/**
 * 圆形，实现 Shape 接口。
 */
public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}
