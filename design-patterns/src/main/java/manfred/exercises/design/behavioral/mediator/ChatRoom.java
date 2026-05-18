package manfred.exercises.design.behavioral.mediator;

import java.util.Date;

/**
 * 聊天室中介者，负责协调用户之间的消息传递。
 */
public class ChatRoom {
   public static void showMessage(User user, String message){
      System.out.println(new Date().toString()
         + " [" + user.getName() +"] : " + message);
   }
}
