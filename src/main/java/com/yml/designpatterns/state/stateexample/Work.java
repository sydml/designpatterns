package com.yml.designpatterns.state.stateexample;

/**
 * @author Liuym
 * @date 2018/12/26 0026
 */
public class Work {
    private State current;
    public Work(){
        current = new ForenoonState();
    }
    private double hour;
    private Boolean finish= false;
    public Boolean taskFinished;

    public void writeProgram() {
        current.writeProgram(this);
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public Boolean getFinish() {
        return finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }

    public Boolean getTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(Boolean taskFinished) {
        this.taskFinished = taskFinished;
    }
}
