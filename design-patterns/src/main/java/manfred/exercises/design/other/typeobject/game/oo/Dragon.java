package manfred.exercises.design.other.typeobject.game.oo;

/**
 * 龙怪物类，继承 Monster，以喷火作为攻击方式。
 */
public class Dragon extends Monster {
    public Dragon() {
        super(500);
    }

    @Override
    public String attackString() {
        return "The dragon breathes fire!";
    }
}
