package com.yml.designpatterns.bridge;

/**
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class RefindedAbstraction extends Abstraction {
    @Override
    public void operator() {
        implementor.operation();
    }
}
