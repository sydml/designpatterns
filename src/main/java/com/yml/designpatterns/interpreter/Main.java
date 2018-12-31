package com.yml.designpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 解释器模式
 *
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> expressions = new ArrayList<>();
        expressions.add(new TerminalExpression());
        expressions.add(new NonTerminalExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new NonTerminalExpression());
        for (AbstractExpression expression : expressions) {
            expression.interpret(context);
        }
    }
}
