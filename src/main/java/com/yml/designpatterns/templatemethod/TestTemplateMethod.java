package com.yml.designpatterns.templatemethod;

/**
 * @author Liuym
 * @date 2018/12/20 0020
 */
public class TestTemplateMethod {
    public static void main(String[] args) {
        AbstractClass a;
        a = new ConcreteClassA();
        a.templateMethod();
        a = new ConcreteClassB();
        a.templateMethod();
    }
}
