package manfred.exercises.design.behavioral.command;

/**
 * 卖出股票命令，封装卖出操作。
 */
public class SellStock implements Order {
   private Stock abcStock;

   public SellStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   public void execute() {
      abcStock.sell();
   }
}
