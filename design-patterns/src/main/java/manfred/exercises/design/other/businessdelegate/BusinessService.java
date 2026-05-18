package manfred.exercises.design.other.businessdelegate;

/**
 * 业务服务接口，定义业务处理的统一契约。
 * 所有具体业务服务（如 EJB、JMS）均实现此接口。
 */
public interface BusinessService {
    public void doProcessing();
}
