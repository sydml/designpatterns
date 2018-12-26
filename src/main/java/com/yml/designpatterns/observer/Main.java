package com.yml.designpatterns.observer;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.add(new ConcreteObserver("X", subject));
        subject.add(new ConcreteObserver("Y", subject));
        subject.setSubjectState("更新了状态");
        subject.update();
    }
}
