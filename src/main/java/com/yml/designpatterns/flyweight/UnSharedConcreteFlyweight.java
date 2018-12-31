package com.yml.designpatterns.flyweight;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class UnSharedConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的 Flyweight:" + extrinsicState);
    }
}
