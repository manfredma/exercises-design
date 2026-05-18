package manfred.exercises.design.behavioral.chainofresponsibility;

/**
 * 控制台日志处理器，将日志输出到标准控制台。
 */
public class ConsoleLogger extends AbstractLogger {

   public ConsoleLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {
      System.out.println("Standard Console::Logger: " + message);
   }
}
