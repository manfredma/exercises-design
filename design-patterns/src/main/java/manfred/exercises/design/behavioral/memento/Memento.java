package manfred.exercises.design.behavioral.memento;

/**
 * 备忘录，存储发起者对象的内部状态快照。
 */
public class Memento {
   private String state;

   public Memento(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }
}
