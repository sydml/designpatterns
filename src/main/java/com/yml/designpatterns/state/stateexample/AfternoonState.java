package com.yml.designpatterns.state.stateexample;

/**
 * @author Liuym
 * @date 2018/12/26 0026
 */
public class AfternoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前工作时间是下午" + work.getHour() + "点，继续努力");
        }else{
            work.setCurrent(new EveningState());
            work.writeProgram();
        }
    }
}
