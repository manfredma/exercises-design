package manfred.exercises.design.creational.singleton.eager;

/**
 * 饿汉式单例实现。
 * 类加载时即创建唯一实例，线程安全，但不支持延迟加载。
 */
public class SingleObject {

    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject() {
    }

    //获取唯一可用的对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World![eager]");
    }
}
