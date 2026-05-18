package manfred.exercises.design.behavioral.visitor;

/**
 * 访问者模式演示：两种访问者分别遍历同一对象结构，执行不同处理逻辑。
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();
        ConcreteNodeA concreteNodeA = new ConcreteNodeA();
        ConcreteNodeB concreteNodeB = new ConcreteNodeB();
        objectStructure.add(concreteNodeA);
        objectStructure.add(concreteNodeB);
        System.out.println("------------------访问者A访问元素------------------");
        objectStructure.action(new ConcreteVisitorA());
        System.out.println("------------------访问者B访问元素------------------");
        objectStructure.action(new ConcreteVisitorB());
    }
}
