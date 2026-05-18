package manfred.exercises.design.structural.flyweight.sword;

/**
 * 享元模式（剑示例）- 木剑，具体的剑享元对象。
 */
public class WoodSword extends Sword {

    public WoodSword(int aggressivity, String speed, String material) {
        super(aggressivity, speed, material);
    }
}
