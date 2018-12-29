package com.yml.designpatterns.facade;

/**
 * 门面模式：1.简化底层api的调用，2：隐藏不必要的返回结果
 *
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
