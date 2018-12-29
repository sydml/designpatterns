package com.yml.designpatterns.observer;

/**
 * 生产者更新了状态，通知所有的消费者状态发生了变化
 *
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
