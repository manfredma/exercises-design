package manfred.exercises.design.behavioral.template;

/**
 * 游戏抽象模板，定义游戏流程骨架，子类实现具体游戏步骤。
 */
public abstract class Game {
   abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();

   //模板
   public final void play(){

      //初始化游戏
      initialize();

      //开始游戏
      startPlay();

      //结束游戏
      endPlay();
   }
}
