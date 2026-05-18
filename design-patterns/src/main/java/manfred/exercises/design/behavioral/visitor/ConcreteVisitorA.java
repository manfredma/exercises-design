package manfred.exercises.design.behavioral.visitor;

/**
 * 具体访问者 A，实现对节点 A 和节点 B 的特定访问逻辑。
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteNodeA concreteNodeA) {
        //具体处理过程写这里面
        System.out.println("ConcreteVisitorA 处理 concreteNodeA");
    }

    @Override
    public void visit(ConcreteNodeB concreteNodeB) {
        //具体处理过程写这里面
        System.out.println("ConcreteVisitorA 处理 concreteNodeB");
    }
}
