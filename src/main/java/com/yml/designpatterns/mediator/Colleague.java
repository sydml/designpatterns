package com.yml.designpatterns.mediator;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
