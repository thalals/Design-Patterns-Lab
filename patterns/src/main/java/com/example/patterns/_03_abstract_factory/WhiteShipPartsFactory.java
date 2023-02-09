package com.example.patterns._03_abstract_factory;

public class WhiteShipPartsFactory implements ShipPartsFactory{

    @Override
    public AnChore createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
