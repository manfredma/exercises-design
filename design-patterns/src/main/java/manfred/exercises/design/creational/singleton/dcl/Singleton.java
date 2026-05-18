package manfred.exercises.design.creational.singleton.dcl;

/**
 * 双重检查锁（Double-Checked Locking）单例实现。
 * 使用 volatile 关键字确保多线程环境下的可见性与有序性。
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void showMessage() {
        System.out.println("Hello World![dcl]");
    }
}
