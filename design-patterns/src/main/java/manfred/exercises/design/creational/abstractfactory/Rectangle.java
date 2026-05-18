package manfred.exercises.design.creational.abstractfactory;

/**
 * 矩形，实现 Shape 接口。
 */
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}
