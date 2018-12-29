package com.yml.designpatterns.memento;

/**
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
