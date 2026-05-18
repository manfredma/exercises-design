package manfred.exercises.design.behavioral.interpreter;

/**
 * 解释器模式表达式接口，定义解释上下文的统一方法。
 */
public interface Expression {
    boolean interpret(String context);
}
