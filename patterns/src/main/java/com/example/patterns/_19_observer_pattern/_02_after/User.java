package com.example.patterns._19_observer_pattern._02_after;

import lombok.AllArgsConstructor;
import lombok.Getter;

//ConcreteObserver
@Getter
@AllArgsConstructor
public class User implements Subscriber{

    private String name;

    @Override
    public void notifyHandleMessage(String message) {
        System.out.println("받는사람 (" + name + ") " + message );
    }
}
