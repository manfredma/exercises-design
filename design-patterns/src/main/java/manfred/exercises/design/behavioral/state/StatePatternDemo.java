package manfred.exercises.design.behavioral.state;

/**
 * 状态模式演示：通过切换不同状态对象改变上下文的行为。
 */
public class StatePatternDemo {

    public static void main(String[] args){
        //创建状态
        State state = new ConcreteStateB();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
    }
}
