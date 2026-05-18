package manfred.exercises.design.structural.flyweight.sword;

/**
 * 享元模式（剑示例）- 剑的抽象类，封装剑的内部状态：攻击力、速度和材质。
 */
abstract class Sword {
    private int aggressivity;
    private String speed;
    private String material;

    Sword(int aggressivity, String speed, String material) {
        this.aggressivity = aggressivity;
        this.speed = speed;
        this.material = material;
    }

    public int attack(int durability) {
        if (durability > 50)
            return this.getAggressivity();
        else if (durability > 0)
            return this.getAggressivity() / 2;
        return 0;
    }

    public int getAggressivity() {
        return aggressivity;
    }

    public String getSpeed() {
        return speed;
    }

    public String getMaterial() {
        return material;
    }
}
