package manfred.exercises.design.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用者（Broker），负责接收并统一执行命令队列。
 */
public class Broker {
   private List<Order> orderList = new ArrayList<Order>();

   public void takeOrder(Order order){
      orderList.add(order);
   }

   public void placeOrders(){
      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}
