package manfred.exercises.design.creational.singleton.enumerate;

/**
 * 枚举单例实现。
 * 利用枚举天然的线程安全性与防序列化破坏特性实现单例。
 */
public enum Singleton {

    INSTANCE;

    public void showMessage() {
        System.out.println("Hello World![enum]");
    }
}
