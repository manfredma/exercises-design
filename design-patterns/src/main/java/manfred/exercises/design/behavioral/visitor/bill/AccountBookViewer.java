package manfred.exercises.design.behavioral.visitor.bill;

/**
 * 账本查看者抽象类，定义查看消费和收入账单的访问方法。
 */
public abstract class AccountBookViewer {

    /**
     * 查看消费的单子
     *
     * @param bill 支出单
     */
    abstract void view(ConsumeBill bill);

    /**
     * 查看收入的单子
     *
     * @param bill 收入单
     */
    abstract void view(IncomeBill bill);
}
