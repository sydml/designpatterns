package com.yml.designpatterns.singleton;

/**
 * 懒汉式是在程序在被访问时才进行对象的创建，如果在创建实例对象时不加synchronized进行同步处理，则会导致对对象的访问不是线程安全的
 *
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            return lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
