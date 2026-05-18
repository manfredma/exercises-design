package manfred.exercises.design.behavioral.template;

/**
 * 板球游戏，实现模板方法中板球游戏特有的初始化、开始和结束逻辑。
 */
public class Cricket extends Game {

   @Override
   void endPlay() {
      System.out.println("Cricket Game Finished!");
   }

   @Override
   void initialize() {
      System.out.println("Cricket Game Initialized! Start playing.");
   }

   @Override
   void startPlay() {
      System.out.println("Cricket Game Started. Enjoy the game!");
   }
}
