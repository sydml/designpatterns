package com.yml.designpatterns.state;

/**
 * @author Liuym
 * @date 2018/12/26 0026
 */
public class Main {
    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateA());
        c.request();
        c.request();
        c.request();
        c.request();
    }
}
