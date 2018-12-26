package com.yml.designpatterns.bulider;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class Director {
    public void construct(Builder builder) {
        builder.builderPartA();
        builder.builderPartB();
    }
}
