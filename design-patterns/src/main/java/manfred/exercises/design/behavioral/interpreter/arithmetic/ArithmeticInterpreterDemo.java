package manfred.exercises.design.behavioral.interpreter.arithmetic;

/**
 * 算术解释器模式演示：使用 Calculator 解析并计算空格分隔的算术表达式。
 */
public class ArithmeticInterpreterDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("3 + 5 - 4 + 3");
        System.out.println(calculator.calculate());
    }
}
