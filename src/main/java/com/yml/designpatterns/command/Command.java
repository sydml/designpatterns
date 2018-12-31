package com.yml.designpatterns.command;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
