package com.yml.designpatterns.adapter;

/**
 * @author Liuym
 * @date 2018/12/26 0026
 */
public class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
