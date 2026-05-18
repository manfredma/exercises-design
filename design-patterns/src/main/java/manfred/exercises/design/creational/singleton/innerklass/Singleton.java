package manfred.exercises.design.creational.singleton.innerklass;

/**
 * 静态内部类单例实现。
 * 利用类加载机制保证线程安全，同时实现延迟加载。
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello World![inner class]");
    }
}
