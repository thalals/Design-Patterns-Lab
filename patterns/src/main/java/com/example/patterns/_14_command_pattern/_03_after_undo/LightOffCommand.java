package com.example.patterns._14_command_pattern._03_after_undo;

import com.example.patterns._14_command_pattern._01_before.Light;
import lombok.AllArgsConstructor;

/**
 * 커멘드에는 어떤 작업을 하기위해 필요한 모든 요소들이 들어와야한다.
 */

@AllArgsConstructor
public class LightOffCommand implements Command {

    private Light light;

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
