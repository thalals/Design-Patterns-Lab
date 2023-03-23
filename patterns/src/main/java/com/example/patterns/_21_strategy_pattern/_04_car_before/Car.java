package com.example.patterns._21_strategy_pattern._04_car_before;

import com.example.patterns._21_strategy_pattern._04_car_before.strategy.MoveStrategy;

public class Car {

    private int movementDistance;

    public void go(MoveStrategy strategy) {
        movementDistance += strategy.move();
    }
    
    public int getNowMovementResult() {
        return this.movementDistance;
    }
}
