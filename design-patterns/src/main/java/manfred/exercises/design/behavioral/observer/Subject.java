package manfred.exercises.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察主题，维护观察者列表，状态变更时通知所有观察者。
 */
public class Subject {

   private List<Observer> observers
      = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   }
}
