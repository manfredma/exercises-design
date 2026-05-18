package manfred.exercises.design.structural.filter;

import java.util.List;

/**
 * 过滤器模式 - 过滤条件接口，定义过滤人员列表的标准。
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
