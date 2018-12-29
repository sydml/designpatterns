package com.yml.designpatterns.bridge;

/**
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operation() {
        System.out.println("A的具体实现");
    }
}
