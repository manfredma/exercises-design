package manfred.exercises.design.behavioral.state;

/**
 * 具体状态 A，实现状态 A 对应的处理逻辑。
 */
public class ConcreteStateA implements State {

    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateA handle ：" + sampleParameter);
    }
}
