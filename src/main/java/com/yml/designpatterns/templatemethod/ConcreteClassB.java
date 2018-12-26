package com.yml.designpatterns.templatemethod;

/**
 * @author Liuym
 * @date 2018/12/20 0020
 */
public class ConcreteClassB extends AbstractClass {

    @Override
    public void primitiveOperationFirst() {
        System.out.println("ConcreteClassB类的primitiveOperationFirst具体实现");
    }

    @Override
    public void primitiveOperationSecond() {
        System.out.println("ConcreteClassB类的primitiveOperationSecond具体实现");
    }
}
