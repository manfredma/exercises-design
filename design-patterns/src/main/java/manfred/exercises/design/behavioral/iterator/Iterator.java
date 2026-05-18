package manfred.exercises.design.behavioral.iterator;

/**
 * 迭代器接口，定义遍历集合元素的统一方法。
 */
public interface Iterator {
    boolean hasNext();

    Object next();
}
