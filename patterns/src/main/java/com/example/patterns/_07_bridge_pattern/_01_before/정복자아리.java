package com.example.patterns._07_bridge_pattern._01_before;

// 하나의 계층구조로 다양한 특징들을 표현하려다 보니,
// 계층구조가 커지고 각각의 자식클래스를 구현하는 과정이 다른 클래스와 비슷하고 중복코드 같아보임
public class 정복자아리 implements Champion {
    @Override
    public void move() {
        System.out.println( getName() + " 아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println( getName() + " 아리 Q");
    }

    @Override
    public void skillW() {
        System.out.println( getName() + " 아리 W");
    }

    @Override
    public void skillE() {
        System.out.println( getName() + " 아리 E");
    }

    @Override
    public void skillR() { System.out.println( getName() + " 아리 R");}

    @Override
    public String getName() {
        return "정복자 Skin";
    }

}
