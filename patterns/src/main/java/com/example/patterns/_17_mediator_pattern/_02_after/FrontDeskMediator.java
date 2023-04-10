package com.example.patterns._17_mediator_pattern._02_after;

/**
 * 모든 소통을 Mediator 객체를 통하기 때문에 의존성을 하나의 객체로만 몰아넣었음
 *
 */
public class FrontDeskMediator {

    private final CleaningService cleaningService = new CleaningService();
    private final Restaurant restaurant = new Restaurant();
    private final Gym gym = new Gym();

    public void getTowers(Guest guest, int numberOfTowers) {
        cleaningService.getTower(guest.getId(), numberOfTowers);
    }

    public String getRoomNumber(Integer guestId) {
        return guestId + "room number : 1";
    }

    public void dinner(Guest guest) {
        restaurant.dinner(guest.getId());
    }
}
