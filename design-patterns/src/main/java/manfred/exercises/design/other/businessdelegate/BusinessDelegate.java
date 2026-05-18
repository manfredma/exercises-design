package manfred.exercises.design.other.businessdelegate;

/**
 * 业务委托类，将客户端请求委托给实际业务服务处理。
 * 屏蔽了服务查找和调用细节，降低客户端与业务层的耦合。
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        BusinessService businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
