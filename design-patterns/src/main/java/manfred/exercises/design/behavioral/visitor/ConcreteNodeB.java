package manfred.exercises.design.behavioral.visitor;

/**
 * 具体节点 B，实现 accept 方法将自身传递给访问者处理。
 */
public class ConcreteNodeB implements Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
