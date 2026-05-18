package manfred.exercises.design.other.typeobject.game.oo;

/**
 * 巨魔怪物类，继承 Monster，以棍棒攻击作为攻击方式。
 */
public class Troll extends Monster {
    public Troll() {
        super(300);
    }

    @Override
    public String attackString() {
        return "The troll clubs you!";
    }
}
