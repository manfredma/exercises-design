package manfred.exercises.design.other.typeobject.game.to;

/**
 * 怪物类，通过持有 Breed 类型对象来获取其属性，避免子类爆炸问题。
 * 展示类型对象模式（Type Object Pattern）如何替代继承实现灵活的类型系统。
 */
public class Monster {
    private Breed breed;

    public Monster(Breed breed) {
        this.breed = breed;
    }

    public int getHealth() {
        return breed.getHealth();
    }

    public String attackString() {
        return breed.getAttackString();
    }
}
