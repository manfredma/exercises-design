package manfred.exercises.design.behavioral.strategy;

/**
 * 减法策略，实现两数相减运算。
 */
public class OperationSubstract implements Strategy {
   @Override
   public int doOperation(int num1, int num2) {
      return num1 - num2;
   }
}
