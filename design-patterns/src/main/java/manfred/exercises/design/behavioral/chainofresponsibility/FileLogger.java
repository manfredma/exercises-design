package manfred.exercises.design.behavioral.chainofresponsibility;

/**
 * 文件日志处理器，将日志写入文件。
 */
public class FileLogger extends AbstractLogger {

   public FileLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {
      System.out.println("File::Logger: " + message);
   }
}
