package manfred.exercises.design.creational.singleton.lazy;

/**
 * 懒汉式单例实现（线程安全版）。
 * 使用 synchronized 方法保证多线程下只创建一个实例，但并发性能较低。
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World![lazy]");
    }
}
