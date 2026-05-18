package manfred.exercises.design.structural.proxy;

/**
 * 代理模式演示 - 展示使用代理对象控制对真实对象访问的用法。
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
