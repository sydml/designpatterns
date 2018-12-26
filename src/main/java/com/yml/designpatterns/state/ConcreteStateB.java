package com.yml.designpatterns.state;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class ConcreteStateB implements State{

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
