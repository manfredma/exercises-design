package manfred.exercises.design.behavioral.strategy;

/**
 * 加法策略，实现两数相加运算。
 */
public class OperationAdd implements Strategy {
   @Override
   public int doOperation(int num1, int num2) {
      return num1 + num2;
   }
}
