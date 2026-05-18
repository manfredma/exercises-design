package manfred.exercises.design.other.businessdelegate;

/**
 * 客户端类，持有业务委托对象并通过其执行任务。
 * 客户端无需感知具体业务服务的存在。
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
