package com.example.patterns._17_mediator_pattern._02_after;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Guest {

    public final Integer id;
    private final FrontDeskMediator frontDeskMediator = new FrontDeskMediator();

    public void getTowers(int numberOfTowers) {
        frontDeskMediator.getTowers(this, numberOfTowers);
    }

}
