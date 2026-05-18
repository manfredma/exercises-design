package manfred.exercises.design.behavioral.state;

/**
 * 状态接口，定义状态对应的处理行为。
 */
public interface State {
    /**
     * 状态对应的处理
     */
    public void handle(String sampleParameter);
}
