package com.example.patterns._21_strategy_pattern._04_car_before.strategy;

import com.example.patterns._21_strategy_pattern._04_car_before.RandomUtil;

public class CarMove implements MoveStrategy{

    @Override
    public int move() {
        if (RandomUtil.getNumber() > 4) {
            return 1;
        }
        return 0;
    }
}
