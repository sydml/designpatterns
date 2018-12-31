package com.yml.designpatterns.chainofresponsibility;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("处理的请求级别：" + request);
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
