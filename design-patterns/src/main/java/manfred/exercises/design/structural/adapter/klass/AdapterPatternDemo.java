package manfred.exercises.design.structural.adapter.klass;

/**
 * 类适配器模式演示 - 展示类适配器的使用方式。
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
