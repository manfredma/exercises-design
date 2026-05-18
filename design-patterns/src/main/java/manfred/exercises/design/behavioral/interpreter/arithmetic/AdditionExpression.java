package manfred.exercises.design.behavioral.interpreter.arithmetic;

/**
 * 加法表达式，将两个算术表达式的结果相加。
 */
public class AdditionExpression extends OperatorExpression {
    public AdditionExpression(ArithmeticExpression arithmeticExpression1, ArithmeticExpression arithmeticExpression2) {
        super(arithmeticExpression1, arithmeticExpression2);
    }

    @Override
    public int interptet() {
        return mArithmeticExpression1.interptet() + mArithmeticExpression2.interptet();
    }
}
