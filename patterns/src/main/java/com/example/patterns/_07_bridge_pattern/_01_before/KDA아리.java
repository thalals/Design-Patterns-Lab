package com.example.patterns._07_bridge_pattern._01_before;

public class KDA아리 implements Champion {

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
        return "KDA Skin";
    }
}
