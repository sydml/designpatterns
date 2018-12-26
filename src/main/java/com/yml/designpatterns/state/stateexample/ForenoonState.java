package com.yml.designpatterns.state.stateexample;

/**
 * @author Liuym
 * @date 2018/12/26 0026
 */
public class ForenoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前工作时间是上午"+work.getHour()+"点，精神百倍");
        }else {
            work.setCurrent(new NoonState());
            work.writeProgram();
        }
    }
}
