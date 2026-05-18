package manfred.exercises.design.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式 - 女性过滤条件，筛选出性别为女性的人员。
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
