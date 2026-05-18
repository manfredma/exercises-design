package manfred.exercises.design.arch.orthogonal;

/**
 * 教师实体，实现了 {@link Highly} 接口，用于正交设计排序示例。
 */
public class Teacher implements Highly {
    private String name;

    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
