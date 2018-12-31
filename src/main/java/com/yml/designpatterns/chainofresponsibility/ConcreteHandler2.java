package com.yml.designpatterns.chainofresponsibility;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("处理的请求级别："+ request);
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
