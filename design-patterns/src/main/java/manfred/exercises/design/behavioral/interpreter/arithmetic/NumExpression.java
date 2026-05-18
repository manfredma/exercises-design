package manfred.exercises.design.behavioral.interpreter.arithmetic;

/**
 * 数字终结符表达式，对数字字面量进行解释。
 */
public class NumExpression extends ArithmeticExpression {
    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interptet() {
        return num;
    }
}
