package manfred.exercises.design.behavioral.visitor.bill;

/**
 * 账单接口，定义接受账本查看者访问的方法。
 */
public interface Bill {
    void accept(AccountBookViewer v);
}
