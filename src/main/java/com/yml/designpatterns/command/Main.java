package com.yml.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        List<Command> commandList = new ArrayList<>();
        Command command = new ConcreteCommand(receiver);
        Command command1 = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
        commandList.add(command);
        commandList.add(command1);
        invoker.setCommands(commandList);
        invoker.executeCommands();
    }
}
