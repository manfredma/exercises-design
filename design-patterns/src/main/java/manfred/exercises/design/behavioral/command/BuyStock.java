package manfred.exercises.design.behavioral.command;

/**
 * 买入股票命令，封装买入操作。
 */
public class BuyStock implements Order {
   private Stock abcStock;

   public BuyStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   public void execute() {
      abcStock.buy();
   }
}
