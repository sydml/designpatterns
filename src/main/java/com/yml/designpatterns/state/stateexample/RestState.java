package com.yml.designpatterns.state.stateexample;

/**
 * @author Liuym
 * @date 2018/12/26 0026
 */
public class RestState implements State {

    @Override
    public void writeProgram(Work work) {
        System.out.println("下班时间："+work.getHour());
    }
}
