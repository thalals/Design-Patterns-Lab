package com.example.patterns._21_strategy_pattern._02_after.strategy;

public class Normal implements SpeedStrategy{

    @Override
    public void blueRight() {
        System.out.println("무 궁 화    꽃    이");
    }

    @Override
    public void redRight() {
        System.out.println("피 었 습 니 다.");
    }
}
