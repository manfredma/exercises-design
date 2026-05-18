package manfred.exercises.design.creational.abstractfactory;

/**
 * 绿色，实现 Color 接口。
 */
public class Green implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}
