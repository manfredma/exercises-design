package manfred.exercises.design.behavioral.visitor.bill;

/**
 * 支出账单，记录消费金额和消费项目，支持访问者访问。
 */
public class ConsumeBill implements Bill {

    private double amount;

    private String item;

    public ConsumeBill(double amount, String item) {
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
