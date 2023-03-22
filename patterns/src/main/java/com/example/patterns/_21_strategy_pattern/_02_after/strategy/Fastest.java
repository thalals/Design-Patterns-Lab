package com.example.patterns._21_strategy_pattern._02_after.strategy;

public class Fastest implements SpeedStrategy{

    @Override
    public void blueRight() {
        System.out.println("무궁화꽃이");
    }

    @Override
    public void redRight() {
        System.out.println("피어씀다.");
    }
}