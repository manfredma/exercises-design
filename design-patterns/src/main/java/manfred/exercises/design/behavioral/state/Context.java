package manfred.exercises.design.behavioral.state;

/**
 * 状态模式上下文，持有当前状态对象并将请求委托给状态处理。
 */
public class Context {
    //持有一个State类型的对象实例
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 用户感兴趣的接口方法
     */
    public void request(String sampleParameter) {
        //转调state来处理
        state.handle(sampleParameter);
    }
}
