package com.example.patterns._07_bridge_pattern._02_before;


public class App {

    public static void main(String[] args) {

        Champion kda아리 = new 아리(new KDA_skin());
        kda아리.move();
        kda아리.skillQ();

        Champion poolParty아리 = new 아리(new PoolParty_skin());
        poolParty아리.move();
        poolParty아리.skillR();

    }
}
