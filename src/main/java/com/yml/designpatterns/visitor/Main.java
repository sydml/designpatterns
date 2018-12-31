package com.yml.designpatterns.visitor;

/**
 * 访问者模式
 *
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());
        Visitor v1 = new ConcreteVisitor1();
        Visitor v2 = new ConcreteVisitor2();
        o.accept(v1);
        o.accept(v2);
    }
}
