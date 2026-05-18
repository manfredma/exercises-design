package manfred.exercises.design.structural.adapter.object;

/**
 * 对象适配器模式演示 - 展示对象适配器的使用方式。
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
