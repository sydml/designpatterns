package com.yml.designpatterns.mediator;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public interface Mediator {
    void send(String message, Colleague colleague);
}
