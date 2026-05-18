package manfred.exercises.design.behavioral.visitor.bill;

/**
 * 收入账单，记录收入金额和收入项目，支持访问者访问。
 */
public class IncomeBill implements Bill {

    private double amount;

    private String item;

    public IncomeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    @Override
    public void accept(AccountBookViewer v) {
        v.view(this);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
