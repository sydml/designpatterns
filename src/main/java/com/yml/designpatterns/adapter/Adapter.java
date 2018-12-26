package com.yml.designpatterns.adapter;

/**
 * 封装其他接口，在上层提供新接口，以便于复用
 *
 * @author Liuym
 * @date 2018/12/26 0026
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
