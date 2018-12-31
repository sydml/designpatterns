package com.yml.designpatterns.flyweight;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class ConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体的 Flyweight"+extrinsicState);
    }
}
