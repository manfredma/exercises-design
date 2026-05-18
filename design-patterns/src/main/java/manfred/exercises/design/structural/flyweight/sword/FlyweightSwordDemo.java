package manfred.exercises.design.structural.flyweight.sword;

/**
 * 享元模式（剑示例）演示 - 展示通过工厂共享剑对象实现享元模式的用法。
 */
public class FlyweightSwordDemo {
    public static void main(String[] args) {
        Sword woodSword = SwordFactory.getSword("wood");
        System.out.println("耐久度为100时,实际攻击力为：" + woodSword.attack(100));

        Sword woodSword2 = SwordFactory.getSword("wood");
        System.out.println("耐久度为50时,实际攻击力为：" + woodSword2.attack(50));

        System.out.println("woodSword 和 woodSword2 是否是同一个对象？" + (woodSword == woodSword2));
    }
}
