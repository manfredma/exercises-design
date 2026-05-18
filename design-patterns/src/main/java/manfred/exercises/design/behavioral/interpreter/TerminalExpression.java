package manfred.exercises.design.behavioral.interpreter;

/**
 * 终结符表达式，判断上下文中是否包含指定数据。
 */
public class TerminalExpression implements Expression {

   private String data;

   public TerminalExpression(String data){
      this.data = data;
   }

   @Override
   public boolean interpret(String context) {
      if(context.contains(data)){
         return true;
      }
      return false;
   }
}
