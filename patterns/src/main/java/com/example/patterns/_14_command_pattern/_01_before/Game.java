package com.example.patterns._14_command_pattern._01_before;

import lombok.AllArgsConstructor;

/**
 *  → 조금만 요구사항이 달라져도, 양쪽을 수정해야 하거나 중북에 유사한 코드가 나옴 (ex → 버튼을 눌렀을 때 게임을 실행)
 *  커플링이 심해짐
 */
public class Game {

    private boolean isOn;

    public void start() {
        System.out.println("게임 시작");
        this.isOn = true;
    }


    public void end() {
        System.out.println("게임 끝");
        this.isOn = false;

    }

}
