package com.example.patterns._17_mediator_pattern._02_after;

public class CleaningService {

    private final FrontDeskMediator frontDeskMediator = new FrontDeskMediator();

    public void getTower(Integer guestId, int numberOfTowers) {
        String roomNumber = this.frontDeskMediator.getRoomNumber(guestId);
        System.out.println("provide tower " + roomNumber + " tower " + numberOfTowers);

    }
}
