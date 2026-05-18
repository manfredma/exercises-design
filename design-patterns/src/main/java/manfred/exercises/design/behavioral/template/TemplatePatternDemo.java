package manfred.exercises.design.behavioral.template;

/**
 * 模板方法模式演示：通过模板方法固定游戏流程，子类定制具体步骤实现。
 */
public class TemplatePatternDemo {
   public static void main(String[] args) {

      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();
   }
}
