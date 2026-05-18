package manfred.exercises.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式 - 员工类，可作为叶子节点也可作为容器节点，形成树形组织结构。
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    /** 构造函数 */
    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]");
    }
}
