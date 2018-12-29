package com.yml.designpatterns.singleton;

/**
 * 饿汉式是线程安全的
 *
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
            return singleton;
    }
}
