package manfred.exercises.design.creational.abstractfactory;

/**
 * 蓝色，实现 Color 接口。
 */
public class Blue implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}
