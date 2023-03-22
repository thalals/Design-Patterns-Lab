package com.example.patterns._21_strategy_pattern._01_before;

public class BlueLightRedLight {

    private int speed;

    public BlueLightRedLight(int speed) {
        this.speed = speed;
    }

    //조건 (speed)에 따라 상황이 달라지는(기능 - 알고리즘) 코드
    public void blueRight() {
        if (speed == 1) {
            System.out.println("무 궁 화    꽃    이");
        }
        //조금 더 빠르게
        if (speed == 2) {
            System.out.println("무궁화  꽃  이");
        }
        //더 빠르게
        if (speed == 3) {
            System.out.println("무궁화꽃이");
        }
    }

    public void redRight() {
        if (speed == 1) {
            System.out.println("피 었 습 니 다.");
        }
        //조금 더 빠르게
        if (speed == 2) {
            System.out.println("피었습니다.");
        }
        //더 빠르게
        if (speed == 3) {
            System.out.println("피어씀다.");
        }
    }
}
