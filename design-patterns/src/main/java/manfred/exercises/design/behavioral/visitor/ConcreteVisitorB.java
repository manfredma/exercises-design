package manfred.exercises.design.behavioral.visitor;

/**
 * 具体访问者 B，实现对节点 A 和节点 B 的另一套访问逻辑。
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteNodeA concreteNodeA) {
        //具体处理过程写这里面
        System.out.println("ConcreteVisitorB 处理 concreteNodeA");
    }

    @Override
    public void visit(ConcreteNodeB concreteNodeB) {
        //具体处理过程写这里面
        System.out.println("ConcreteVisitorB 处理 concreteNodeB");
    }
}
