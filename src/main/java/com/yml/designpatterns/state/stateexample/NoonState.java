package com.yml.designpatterns.state.stateexample;

/**
 * @author Liuym
 * @date 2018/12/26 0026
 */
public class NoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前工作时间是" + work.getHour() + "点，饿了，午饭；犯困，午休");
        }else{
            work.setCurrent(new AfternoonState());
            work.writeProgram();
        }
    }
}
