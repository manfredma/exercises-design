package manfred.exercises.design.arch.orthogonal;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.Test;

/**
 * 正交设计排序功能测试，验证 {@link Sorter} 对学生按身高排序的正确性。
 */
public class StudentTest {

    @Test
    public void sortStudentsByHeight() {
        Student[] x = new Student[5];
        for (int i = 0; i < x.length; i++) {
            x[i] = new Student();
            x[i].setHeight(ThreadLocalRandom.current().nextInt(100));
        }
        Arrays.stream(x).forEach(System.out::println);
        Sorter.sortStudentsByHeight(x);
        System.out.println("after sort：");
        Arrays.stream(x).forEach(System.out::println);
    }
}
