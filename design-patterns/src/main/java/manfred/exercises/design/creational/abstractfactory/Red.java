package manfred.exercises.design.creational.abstractfactory;

/**
 * 红色，实现 Color 接口。
 */
public class Red implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Red::fill() method.");
   }
}
