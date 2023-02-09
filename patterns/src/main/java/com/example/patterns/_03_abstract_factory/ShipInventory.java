package com.example.patterns._03_abstract_factory;

import com.example.patterns._02_factory_method.Ship;
import com.example.patterns._02_factory_method.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory whiteShipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = whiteShipFactory.createShip();
        System.out.println("ship.getAnchor().getClass() = " + ship.getAnchor().getClass());
        System.out.println("ship.getWheel().getClass() = " + ship.getWheel().getClass());

    }
}
