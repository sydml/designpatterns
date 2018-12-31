package com.yml.designpatterns.visitor;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class ConcreteVisitor1 implements Visitor {
    @Override
    public void visitorConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName()+"被访问");
    }

    @Override
    public void visitorConcreteElementA(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName()+"被访问");
    }
}
