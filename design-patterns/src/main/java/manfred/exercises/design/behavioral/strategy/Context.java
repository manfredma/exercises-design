package manfred.exercises.design.behavioral.strategy;

/**
 * 策略模式上下文，持有策略对象并将计算委托给具体策略执行。
 */
public class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}
