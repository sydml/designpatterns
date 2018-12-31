package com.yml.designpatterns.visitor;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public interface Visitor {
    void visitorConcreteElementA(ConcreteElementA concreteElementA);
    void visitorConcreteElementA(ConcreteElementB concreteElementB);
}
