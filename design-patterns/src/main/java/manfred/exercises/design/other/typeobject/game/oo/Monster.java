package manfred.exercises.design.other.typeobject.game.oo;

/**
 * 怪物抽象基类，使用传统面向对象继承方式定义怪物行为。
 * 每种怪物类型通过子类化来定义其特有的攻击方式。
 */
public abstract class Monster {
    private final int health;

    public Monster(int startingHealth) {
        this.health = startingHealth;
    }

    public int getHealth() {
        return health;
    }

    public abstract String attackString();
}
