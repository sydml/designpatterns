package com.yml.designpatterns.state.stateexample;

/**
 * @author Liuym
 * @date 2018/12/26 0026
 */
public class Main {
    public static void main(String[] args) {
        Work emergencyWork = new Work();
        emergencyWork.setHour(20);
//        emergencyWork.setFinish(true);
        emergencyWork.writeProgram();

    }
}
