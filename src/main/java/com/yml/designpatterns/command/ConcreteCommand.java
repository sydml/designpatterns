package com.yml.designpatterns.command;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
