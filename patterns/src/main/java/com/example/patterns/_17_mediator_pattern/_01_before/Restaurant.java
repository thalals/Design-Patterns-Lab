package com.example.patterns._17_mediator_pattern._01_before;

public class Restaurant {

    private CleaningService cleaningService = new CleaningService();

    public void dinner(Guest guest) {
        System.out.println("dinner " + guest);
    }

    public void clean() {
        cleaningService.clean(this);
    }
}
