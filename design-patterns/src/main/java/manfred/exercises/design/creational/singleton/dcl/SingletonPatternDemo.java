package manfred.exercises.design.creational.singleton.dcl;

/**
 * 双重检查锁单例模式演示入口。
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        Singleton object = Singleton.getInstance();

        //显示消息
        object.showMessage();
    }
}
