package manfred.exercises.design.behavioral.observer;

/**
 * 观察者模式演示：主题状态变更后自动通知所有已注册的观察者。
 */
public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 15");
      subject.setState(15);
      System.out.println("Second state change: 10");
      subject.setState(10);
   }
}
