package com.example.patterns._07_bridge_pattern._01_before;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new KDA아리();
        kda아리.skillQ();
        kda아리.skillR();

        Champion poolParty아리 = new PoolParty아리();
        poolParty아리.move();
        poolParty아리.skillR();
    }
}
