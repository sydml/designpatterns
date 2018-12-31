package com.yml.designpatterns.visitor;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorConcreteElementA(this);
    }

    public void operationB() {

    }
}
