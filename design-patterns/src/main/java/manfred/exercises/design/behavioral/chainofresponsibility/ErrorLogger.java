package manfred.exercises.design.behavioral.chainofresponsibility;

/**
 * 错误日志处理器，将错误级别日志输出到错误控制台。
 */
public class ErrorLogger extends AbstractLogger {

   public ErrorLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {
      System.out.println("Error Console::Logger: " + message);
   }
}
