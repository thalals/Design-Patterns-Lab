package com.example.patterns._21_strategy_pattern._02_after.strategy;

public class Faster  implements SpeedStrategy{

    @Override
    public void blueRight() {
        System.out.println("무궁화  꽃  이");
    }

    @Override
    public void redRight() {
        System.out.println("피었습니다.");
    }
}
