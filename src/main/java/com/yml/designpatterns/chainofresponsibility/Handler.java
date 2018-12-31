package com.yml.designpatterns.chainofresponsibility;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handlerRequest(int request);
}
