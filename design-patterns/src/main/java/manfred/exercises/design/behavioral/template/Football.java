package manfred.exercises.design.behavioral.template;

/**
 * 足球游戏，实现模板方法中足球游戏特有的初始化、开始和结束逻辑。
 */
public class Football extends Game {

   @Override
   void endPlay() {
      System.out.println("Football Game Finished!");
   }

   @Override
   void initialize() {
      System.out.println("Football Game Initialized! Start playing.");
   }

   @Override
   void startPlay() {
      System.out.println("Football Game Started. Enjoy the game!");
   }
}
