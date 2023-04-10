package com.example.patterns._17_mediator_pattern._02_after;

import com.example.patterns._17_mediator_pattern._01_before.Guest;

public class Restaurant {

    private FrontDeskMediator mediator = new FrontDeskMediator();

    public void dinner(int guestId) {
        System.out.println("dinner " + mediator.get);
    }
}
