package com.yml.designpatterns.factory;

/**
 * @author Liuym
 * @date 2018/12/20 0020
 */
public class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
