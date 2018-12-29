package com.yml.designpatterns.bridge;

/**
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operation() {
        System.out.println("B的具体实现");
    }
}
