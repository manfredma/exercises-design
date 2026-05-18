package manfred.exercises.design.behavioral.memento;

/**
 * 备忘录模式发起者，负责创建和恢复状态快照。
 */
public class Originator {
   private String state;

   public void setState(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }

   public Memento saveStateToMemento(){
      return new Memento(state);
   }

   public void getStateFromMemento(Memento Memento){
      state = Memento.getState();
   }
}
