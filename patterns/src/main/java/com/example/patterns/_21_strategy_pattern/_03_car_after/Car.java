package com.example.patterns._21_strategy_pattern._03_car_after;

public class Car {

    private int movementDistance;

    public void go() {
        if (RandomUtil.getNumber() > 4) {
            movementDistance += 1;
        }
    }

    public int getNowMovementResult() {
        return this.movementDistance;
    }
}
