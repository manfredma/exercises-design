package manfred.exercises.design.other.typeobject.game.to;

/**
 * 品种类，作为类型对象（Type Object）存储怪物品种的共享属性。
 * 包含生命值和攻击描述，多个 Monster 实例可共享同一个 Breed。
 */
public class Breed {

    private int health;

    private String attackString;

    public Breed(int health, String attackString) {
        this.health = health;
        this.attackString = attackString;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getAttackString() {
        return attackString;
    }

    public void setAttackString(String attackString) {
        this.attackString = attackString;
    }
}
