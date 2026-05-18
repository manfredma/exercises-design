package manfred.exercises.design.behavioral.mediator;

/**
 * 中介者模式演示：用户通过聊天室中介者互发消息，降低对象间直接耦合。
 */
public class MediatorPatternDemo {
   public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");

      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
   }
}
