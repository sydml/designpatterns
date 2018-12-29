package com.yml.designpatterns.bridge;

/**
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class Main {
    public static void main(String[] args) {
        Abstraction ab = new RefindedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.operator();
        ab.setImplementor(new ConcreteImplementorB());
        ab.operator();
    }
}
