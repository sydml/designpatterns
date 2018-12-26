package com.yml.designpatterns.bulider;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public interface Builder {
    void builderPartA();
    void builderPartB();
    Product getResult();
}
