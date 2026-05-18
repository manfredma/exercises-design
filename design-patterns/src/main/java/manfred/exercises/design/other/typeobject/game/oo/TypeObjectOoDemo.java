package manfred.exercises.design.other.typeobject.game.oo;

/**
 * 面向对象方式实现的游戏怪物示例演示入口。
 * 对比展示传统继承方式（OO）与类型对象方式（TO）在描述怪物行为上的差异。
 */
public class TypeObjectOoDemo {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        Troll troll = new Troll();

        System.out.println(dragon.attackString());
        System.out.println(troll.attackString());
    }
}
