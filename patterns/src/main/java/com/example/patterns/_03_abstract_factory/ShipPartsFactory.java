package com.example.patterns._03_abstract_factory;

public interface ShipPartsFactory {

    AnChore createAnchor();

    Wheel createWheel();
}
