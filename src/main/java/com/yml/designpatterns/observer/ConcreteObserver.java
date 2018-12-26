package com.yml.designpatterns.observer;

/**
 * 主题对象发生变化的时候通知所有的观察者更新状态
 *
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class ConcreteObserver extends Observer {

    private String name;

    private String observerState;

    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者"+name+"的新状态"+observerState);
    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }
}
