package com.yml.designpatterns.memento;

/**
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
