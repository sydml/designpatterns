package com.yml.designpatterns.facade;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
