package manfred.exercises.design.structural.flyweight.sword;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式（剑示例）- 剑工厂，通过缓存复用已创建的剑享元对象。
 */
public class SwordFactory {
    private static Map<String, Sword> map = new HashMap<>();

    static Sword getSword(String s) {
        Sword sword = map.get(s);
        if (sword != null)
            return sword;

        if (s.equals("wood"))
            sword = new WoodSword(10, "快", "木头");
        else if (s.equals("iron"))
            sword = new IronSword(50, "较快", "铁");

        if (sword == null)
            return null;
        map.put(s, sword);
        return sword;
    }
}
