package manfred.exercises.design.behavioral.observer;

/**
 * 十六进制观察者，将主题状态以十六进制字符串形式输出。
 */
public class HexaObserver extends Observer {

   public HexaObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Hex String: "
      + Integer.toHexString( subject.getState() ).toUpperCase() );
   }
}
