package com.example.patterns._14_command_pattern._01_before;

import lombok.AllArgsConstructor;

/**
 *  요청을 보내는 invoker (Button) 와 응답을 보내는 recevier (light) 가 강하게 결합되어있어
 *  한 쪽이 수정 시 양쪽을 전부 수정해야함
 *
 *  → 조금만 요구사항이 달라져도, 양쪽을 수정해야 하거나 중북에 유사한 코드가 나옴 (ex → 버튼을 눌렀을 때 게임을 실행)
 *  커플링이 심해짐
 */
@AllArgsConstructor
public class Button {

    private Light lights;

    public void press() {
        lights.on();

        //요청사항이 바뀌면 코드가 수정되어야함
        //lights.off()
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
    }
}
