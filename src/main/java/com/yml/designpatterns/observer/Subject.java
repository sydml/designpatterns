package com.yml.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 生产者
 *
 * @author Liuym
 * @date 2018/12/25 0025
 */
public abstract class Subject {
    private List<Observer> list = new ArrayList<>();

    public void add(Observer observer) {
        list.add(observer);
    }

    public void remove(Observer observer) {
        list.remove(observer);
    }

    public void update() {
        list.forEach(Observer::update);
    }

}
