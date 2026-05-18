package manfred.exercises.design.other.mvc;

/**
 * 学生模型类，封装学生的学号和姓名数据。
 * 在 MVC 模式中充当 Model 角色。
 */
public class Student {
    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
