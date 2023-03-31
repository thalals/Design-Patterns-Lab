package com.example.patterns._14_command_pattern._03_after_undo;

import java.util.Stack;

public class Button {

    //커멘드 패턴은 명령어를 넘긴다.
    private final Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        this.commands.push(command);
    }

    public void undo() {
        if (!commands.empty()) {
            Command command = commands.pop();
            command.undo();
        }
    }
}
