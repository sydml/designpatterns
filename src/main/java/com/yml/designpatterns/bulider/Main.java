package com.yml.designpatterns.bulider;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();
        director.construct(builderA);
        Product p1 = builderA.getResult();
        p1.show();

        director.construct(builderB);
        Product p2 = builderB.getResult();
        p2.show();
    }
}
