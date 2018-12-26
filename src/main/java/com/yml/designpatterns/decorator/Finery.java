package com.yml.designpatterns.decorator;

/**
 * @author Liuym
 * @date 2018/12/16 0016
 */
public class Finery extends Person{

    protected Person component;

    public void decorator(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
