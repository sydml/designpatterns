package com.yml.designpatterns.decorator;

/**
 * @author Liuym
 * @date 2018/12/16 0016
 */
public class Person {
    public Person() {
    }
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.format("装扮的%s",name);
    }
}
