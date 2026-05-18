package manfred.exercises.design.behavioral.strategy;

/**
 * 乘法策略，实现两数相乘运算。
 */
public class OperationMultiply implements Strategy {
   @Override
   public int doOperation(int num1, int num2) {
      return num1 * num2;
   }
}
