package com.yml.designpatterns.state;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }

}