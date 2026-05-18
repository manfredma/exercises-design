package manfred.exercises.design.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式 - 单身过滤条件，筛选出婚姻状态为单身的人员。
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
