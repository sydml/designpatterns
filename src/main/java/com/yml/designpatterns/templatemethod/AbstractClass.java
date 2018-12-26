package com.yml.designpatterns.templatemethod;

/**
 * @author Liuym
 * @date 2018/12/20 0020
 */
public abstract class AbstractClass {

    public abstract void primitiveOperationFirst();

    public abstract void primitiveOperationSecond();

    /**
     * 模板方法模式是把不变的逻辑移动至父类
     */
    public void templateMethod() {
        primitiveOperationFirst();
        primitiveOperationSecond();
        System.out.println("");
    }

}
