package manfred.exercises.design.behavioral.state;

/**
 * 具体状态 B，实现状态 B 对应的处理逻辑。
 */
public class ConcreteStateB implements State {

    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle ：" + sampleParameter);
    }
}
