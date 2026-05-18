package manfred.exercises.design.behavioral.interpreter.arithmetic;

/**
 * 减法表达式，将两个算术表达式的结果相减。
 */
public class SubtractionExpreesion extends OperatorExpression {
    public SubtractionExpreesion(ArithmeticExpression arithmeticExpression1, ArithmeticExpression arithmeticExpression2) {
        super(arithmeticExpression1, arithmeticExpression2);
    }

    @Override
    public int interptet() {
        return mArithmeticExpression1.interptet() - mArithmeticExpression2.interptet();
    }
}
