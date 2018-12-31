package com.yml.designpatterns.chainofresponsibility;

import java.util.Arrays;
import java.util.List;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class Main {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        List<Integer> requests = Arrays.asList(1, 11, 20);
        requests.forEach(it -> h1.handlerRequest(it));
    }
}
