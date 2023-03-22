package com.example.patterns._21_strategy_pattern._02_after;

import com.example.patterns._21_strategy_pattern._02_after.strategy.SpeedStrategy;

//Context Class
public class BlueLightRedLight {

    private SpeedStrategy speed;

    public BlueLightRedLight(SpeedStrategy speed) {
        this.speed = speed;
    }

    //조건 (speed)에 따라 상황이 달라지는(기능 - 알고리즘) 코드
    public void blueRight() {
        speed.blueRight();
    }

    public void redRight() {
        speed.redRight();
    }
}
