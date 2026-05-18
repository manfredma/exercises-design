package manfred.exercises.design.behavioral.command;

/**
 * 股票接收者，提供买入和卖出操作。
 */
public class Stock {

   private String name = "ABC";
   private int quantity = 10;

   public void buy(){
      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
   }
   public void sell(){
      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
   }
}
