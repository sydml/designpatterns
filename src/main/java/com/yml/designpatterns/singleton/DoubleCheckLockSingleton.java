package com.yml.designpatterns.singleton;

/**
 * 双检锁单利模式，解决并发问题，volatile 解决指令重排序导致对象内部变量引用对象未实例化完成出现问题
 * 第二层检查的目的是为了多线程时创建多个实例问题
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class DoubleCheckLockSingleton {
    private static volatile DoubleCheckLockSingleton singleton = null;
    private DoubleCheckLockSingleton(){}

    public static DoubleCheckLockSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckLockSingleton();
                }
            }
        }
        return singleton;
    }
}
