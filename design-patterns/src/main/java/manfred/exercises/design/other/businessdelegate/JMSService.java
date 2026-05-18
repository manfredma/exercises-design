package manfred.exercises.design.other.businessdelegate;

/**
 * JMS 服务实现类，模拟通过 JMS 消息中间件方式执行业务处理。
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
