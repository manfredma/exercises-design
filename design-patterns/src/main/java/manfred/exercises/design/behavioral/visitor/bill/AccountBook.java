package manfred.exercises.design.behavioral.visitor.bill;

import java.util.ArrayList;
import java.util.List;

/**
 * 账本，维护账单列表并允许查看者依次访问所有账单。
 */
public class AccountBook {

    /**
     * 单子列表
     */
    private final List<Bill> billList = new ArrayList<Bill>();

    /**
     * 添加单子
     */
    public void addBill(Bill bill) {
        billList.add(bill);
    }

    /**
     * 供账本的查看者查看账本
     */
    public void show(AccountBookViewer viewer) {
        for (Bill bill : billList) {
            bill.accept(viewer);
        }
    }
}
