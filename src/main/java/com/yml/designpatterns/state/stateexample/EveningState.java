package com.yml.designpatterns.state.stateexample;

/**
 * @author Liuym
 * @date 2018/12/26 0026
 */
public class EveningState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getFinish()) {
            work.setCurrent(new RestState());
            work.writeProgram();
        }else{
            if (work.getHour() < 21) {
                System.out.println("今天加班至" + work.getHour() + "点，疲惫至极");
            }else{
                work.setCurrent(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
