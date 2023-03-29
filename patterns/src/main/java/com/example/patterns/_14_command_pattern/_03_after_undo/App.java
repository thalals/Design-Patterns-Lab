package com.example.patterns._14_command_pattern._03_after_undo;

import com.example.patterns._14_command_pattern._01_before.Game;
import com.example.patterns._14_command_pattern._01_before.Light;

public class App {

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new LightOnCommand(new Light()));
        button.press(new GameStartCommand(new Game()));
        button.undo();
        button.undo();
    }
}
