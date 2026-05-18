package manfred.exercises.design.behavioral.interpreter.arithmetic;

/**
 * 运算符非终结符表达式抽象基类，持有左右两个操作数表达式。
 */
public abstract class OperatorExpression extends ArithmeticExpression {
    protected ArithmeticExpression mArithmeticExpression1, mArithmeticExpression2;

    public OperatorExpression(ArithmeticExpression arithmeticExpression1, ArithmeticExpression arithmeticExpression2) {
        mArithmeticExpression1 = arithmeticExpression1;
        mArithmeticExpression2 = arithmeticExpression2;
    }
}
