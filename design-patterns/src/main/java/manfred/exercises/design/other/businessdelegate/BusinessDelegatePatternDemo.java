package manfred.exercises.design.other.businessdelegate;

/**
 * 业务委托模式演示类，展示客户端通过 BusinessDelegate 调用不同业务服务的完整流程。
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
