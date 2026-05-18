package manfred.exercises.design.creational.abstractfactory;

/**
 * 正方形，实现 Shape 接口。
 */
public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}
