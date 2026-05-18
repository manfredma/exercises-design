package manfred.exercises.design.structural.flyweight.sword;

/**
 * 享元模式（剑示例）- 铁剑，具体的剑享元对象。
 */
public class IronSword extends Sword {

    IronSword(int aggressivity, String speed, String material) {
        super(aggressivity, speed, material);
    }
}
