package manfred.exercises.design.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录管理者，负责存储和检索备忘录列表，但不操作其内容。
 */
public class CareTaker {
   private List<Memento> mementoList = new ArrayList<Memento>();

   public void add(Memento state){
      mementoList.add(state);
   }

   public Memento get(int index){
      return mementoList.get(index);
   }
}
