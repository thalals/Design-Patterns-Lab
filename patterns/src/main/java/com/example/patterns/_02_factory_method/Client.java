package com.example.patterns._02_factory_method;

public class Client {

    public static void main(String[] args) {

        Ship whiteShip =new WhiteShipFactory().orderShip("WhiteShip", "one@email.com");
        System.out.println("whiteShip = " + whiteShip.toString());

        Ship blackShip = new BlackShipFactory().orderShip("blackShip", "two@email.com");
        System.out.println("blackShip = " + blackShip.toString());
    }
}
