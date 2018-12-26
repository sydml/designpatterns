package com.yml.designpatterns.state.stateexample;

/**
 * @author Liuym
 * @date 2018/12/26 0026
 */
public class SleepingState implements State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("current time is" + work.getHour() + ",need sleep");
    }
}
