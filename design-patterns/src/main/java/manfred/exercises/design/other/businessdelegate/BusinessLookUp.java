package manfred.exercises.design.other.businessdelegate;

/**
 * 业务查询服务，根据服务类型名称查找并返回对应的业务服务实现。
 * 在业务委托模式中充当服务定位器的角色。
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
