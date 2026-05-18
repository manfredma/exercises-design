package manfred.exercises.design.other.mvc;

/**
 * 学生视图类，负责将学生信息输出到控制台。
 * 在 MVC 模式中充当 View 角色。
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
