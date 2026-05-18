package manfred.exercises.design.other.typeobject.game.to;

/**
 * 类型对象方式实现的游戏怪物示例演示入口。
 * 展示通过 Breed 类型对象配置不同怪物行为，无需继承子类即可灵活扩展。
 */
public class TypeObjectToDemo {
    public static void main(String[] args) {
        Breed dragonBreed = new Breed(500, "The dragon breathes fire!");
        Breed trollBreed = new Breed(300, "The troll clubs you!");

        Monster dragon = new Monster(dragonBreed);
        Monster troll = new Monster(trollBreed);

        System.out.println(dragon.attackString());
        System.out.println(troll.attackString());
    }
}
