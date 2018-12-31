package com.yml.designpatterns.interpreter;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
