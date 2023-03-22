package com.example.patterns._21_strategy_pattern._02_after;

import com.example.patterns._21_strategy_pattern._02_after.strategy.Fastest;
import com.example.patterns._21_strategy_pattern._02_after.strategy.Normal;
import com.example.patterns._21_strategy_pattern._02_after.strategy.SpeedStrategy;

public class Client {

    public static void main(String[] args) {
        //전략에 따라 어떤 기능을 행할건지 선택하면 됨
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Normal());
        blueLightRedLight.blueRight();
        blueLightRedLight.redRight();

        //매소드 파라미터에서 전략을 매개변수로 받아서 실행해도 됨 → 중요한건 전략을 유연하게 선택한다는 것
        BlueLightRedLight_2 context = new BlueLightRedLight_2();
        context.blueRight(new Normal());
        context.redRight(new Fastest());

        //기능을 추상화했기 때문에 익명함수로 그때의 전략을 구현해서 주입해도 됨 (마치 JAVA Comparator)
        BlueLightRedLight anonymityStrategy = new BlueLightRedLight(new SpeedStrategy() {
            @Override
            public void blueRight() {

            }

            @Override
            public void redRight() {

            }
        });
    }
}
