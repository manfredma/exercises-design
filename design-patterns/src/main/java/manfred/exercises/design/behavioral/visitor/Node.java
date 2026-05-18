package manfred.exercises.design.behavioral.visitor;

/**
 * 节点接口，定义接受访问者的方法（动态分派入口）。
 */
public interface Node {
    //这里是动态分派，接口类不好体现。我们看下结构类
    void accept(Visitor visitor);
}
