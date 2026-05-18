package manfred.exercises.design.behavioral.visitor.bill;

/**
 * 账单访问者模式演示：老板和注会以不同视角访问同一账本，各自处理收支数据。
 */
public class BillVisitorDemo {

    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();
        //添加两条收入
        accountBook.addBill(new IncomeBill(10000, "卖商品"));
        accountBook.addBill(new IncomeBill(12000, "卖广告位"));
        //添加两条支出
        accountBook.addBill(new ConsumeBill(1000, "工资"));
        accountBook.addBill(new ConsumeBill(2000, "材料费"));

        Boss boss = new Boss();
        AccountBookViewer cpa = new Cpa();

        //两个访问者分别访问账本
        accountBook.show(cpa);
        accountBook.show(boss);

        boss.getTotalConsume();
        boss.getTotalIncome();
    }
}
