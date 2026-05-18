package manfred.exercises.design.behavioral.mediator;

/**
 * 用户类，通过聊天室中介者发送消息，不与其他用户直接交互。
 */
public class User {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public User(String name){
      this.name  = name;
   }

   public void sendMessage(String message){
      ChatRoom.showMessage(this,message);
   }
}
