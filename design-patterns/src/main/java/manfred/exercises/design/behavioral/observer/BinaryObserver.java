package manfred.exercises.design.behavioral.observer;

/**
 * 二进制观察者，将主题状态以二进制字符串形式输出。
 */
public class BinaryObserver extends Observer {

   public BinaryObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Binary String: "
      + Integer.toBinaryString( subject.getState() ) );
   }
}
