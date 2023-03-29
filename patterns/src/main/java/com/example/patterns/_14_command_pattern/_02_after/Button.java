package com.example.patterns._14_command_pattern._02_after;

import com.example.patterns._14_command_pattern._01_before.Game;
import com.example.patterns._14_command_pattern._01_before.Light;

public class Button {

    private final Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {

        /**
         * Command 가 바뀌거나, 요구사항이 추가되더라도 invoker 는 수정이 일어나지 않아도 된다.
         * 수정의 범위가 축소, Command 재사용성의 증가, 책임의 분리
         */

        Button button_1 = new Button(new LightOffCommand(new Light()));
        Button button_2 = new Button(new LightOffCommand(new Light()));
        Button button_3 = new Button(new GameStartCommand(new Game()));

        button_1.press();
        button_2.press();
        button_3.press();

    }
}
