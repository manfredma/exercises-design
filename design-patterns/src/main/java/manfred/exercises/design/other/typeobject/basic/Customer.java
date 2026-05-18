package manfred.exercises.design.other.typeobject.basic;

/**
 * 客户类，代表租借录像带的顾客。
 * 持有顾客姓名，并提供租金扣费操作。
 */
public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void chargeForRental(double rental) {
        System.out.println("chargeForRental: " + rental + ", customer: " + name);
    }

    public String getName() {
        return name;
    }
}
