package manfred.exercises.design.other.businessdelegate;

/**
 * EJB 服务实现类，模拟通过 EJB 方式执行业务处理。
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
