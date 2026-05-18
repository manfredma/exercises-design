package manfred.exercises.design.structural.adapter.object;

/**
 * 对象适配器 - 通过持有被适配者对象并实现目标接口，将被适配者的接口转换为目标接口。
 */
public class Adapter implements Target {

    /** 适配者是对象适配器的一个属性 */
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...一些操作...
        adaptee.adapteeRequest();
        //...一些操作...
    }
}
