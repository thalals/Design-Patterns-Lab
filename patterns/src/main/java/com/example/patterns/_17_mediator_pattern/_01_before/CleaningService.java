package com.example.patterns._17_mediator_pattern._01_before;

/**
 * 각 객체와 직접 연결되어있기 때문에 → 엄청난 의존성을 가지고 있는 클리닝 객체
 *
 *  이렇게 되면
 *  1. 테스트하기 어려움
 *  2. 코드의 유지보수도 힘들어짐
 *  3. 수정도 힘듬 (양쪽 다 수정해야하고 어디에 영향을 끼치는지 파악할 수 없음)
 */
public class CleaningService {

    public void clean(Restaurant restaurant) {
        System.out.println("Clean " + restaurant);
    }

    public void clean(Gym gym) {
        System.out.println("Clean " + gym);
    }

    public void getTower(Guest guest, int numberOfTower) {
        System.out.println(numberOfTower + " towers to " + guest);
    }
}
