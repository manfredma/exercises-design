package manfred.exercises.design.structural.adapter.klass;

/**
 * 类适配器 - 通过继承被适配者并实现目标接口，将被适配者的接口转换为目标接口。
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        //...一些操作...
        super.adapteeRequest();
        //...一些操作...
    }
}
