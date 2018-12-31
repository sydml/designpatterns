package com.yml.designpatterns.chainofresponsibility;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request > 0 && request < 10) {
            System.out.println("处理请求级别：" + request);
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
