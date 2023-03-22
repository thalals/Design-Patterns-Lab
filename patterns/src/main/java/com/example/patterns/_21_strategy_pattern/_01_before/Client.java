package com.example.patterns._21_strategy_pattern._01_before;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(1);
        blueLightRedLight.blueRight();
        blueLightRedLight.redRight();

    }
}
