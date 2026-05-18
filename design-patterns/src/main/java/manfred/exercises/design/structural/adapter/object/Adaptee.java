package manfred.exercises.design.structural.adapter.object;

/**
 * 对象适配器模式 - 被适配者类，包含需要被适配的方法。
 */
public class Adaptee {
    public void adapteeRequest() {
        System.out.println("被适配者的方法");
    }
}
