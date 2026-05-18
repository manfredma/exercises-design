package manfred.exercises.design.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式 - 男性过滤条件，筛选出性别为男性的人员。
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
