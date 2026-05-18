package manfred.exercises.design.behavioral.visitor.bill;

/**
 * 注册会计师账本查看者，检查工资是否缴税及收入是否已申报税务。
 */
public class Cpa extends AccountBookViewer {

    //注会在看账本时，如果是支出，则如果支出是工资，则需要看应该交的税交了没
    public void view(ConsumeBill bill) {
        if (bill.getItem().equals("工资")) {
            System.out.println("注会查看工资是否交个人所得税。");
        }
    }

    //如果是收入，则所有的收入都要交税
    public void view(IncomeBill bill) {
        System.out.println("注会查看收入交税了没。");
    }
}
