package com.yml.designpatterns.bridge;

/**
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operator() {
        implementor.operation();
    }
}
