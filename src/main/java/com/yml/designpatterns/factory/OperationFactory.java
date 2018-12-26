package com.yml.designpatterns.factory;

/**
 * @author Liuym
 * @date 2018/12/13 0013
 */
public class OperationFactory {

    public static Operation createOpeartion(String operation) {
        Operation oper = null;
        switch (operation) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                throw new RuntimeException("Have not input operation symbol");
        }
        return oper;
    }
}
