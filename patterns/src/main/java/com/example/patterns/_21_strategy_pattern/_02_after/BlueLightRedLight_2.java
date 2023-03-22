package com.example.patterns._21_strategy_pattern._02_after;

import com.example.patterns._21_strategy_pattern._02_after.strategy.SpeedStrategy;

//Context Class
public class BlueLightRedLight_2 {

    //매소드에서 전략을 파라미터로 선택
    public void blueRight(SpeedStrategy speed) {
        speed.blueRight();
    }

    public void redRight(SpeedStrategy speed) {
        speed.redRight();
    }
}
