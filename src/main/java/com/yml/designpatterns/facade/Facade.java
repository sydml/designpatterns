package com.yml.designpatterns.facade;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;
    private SubSystemFour subSystemFour;

    public Facade(){
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("门面模式方法组A");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }

    public void methodB() {
        System.out.println("门面模式方法组B");
        subSystemOne.methodOne();
        subSystemFour.methodFour();
    }

}
