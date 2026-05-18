package manfred.exercises.design.behavioral.observer;

/**
 * 八进制观察者，将主题状态以八进制字符串形式输出。
 */
public class OctalObserver extends Observer {

   public OctalObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
     System.out.println( "Octal String: "
     + Integer.toOctalString( subject.getState() ) );
   }
}
