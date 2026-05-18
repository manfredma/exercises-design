package manfred.exercises.design.structural.adapter.object;

/**
 * 对象适配器模式 - 目标接口的具体实现类。
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
