package com.yml.designpatterns.command;

import java.util.List;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class Invoker {
    private Command command;

    private List<Command> commands;

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

    public void executeCommands() {
        commands.forEach(Command::execute);
    }
}
