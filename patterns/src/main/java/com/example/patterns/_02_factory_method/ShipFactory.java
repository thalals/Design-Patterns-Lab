package com.example.patterns._02_factory_method;

import com.example.patterns._02_factory_method.Ship;
import java.util.Objects;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);

        return createShip();
    }

    Ship createShip();

    private void validate(String name, String email) {
        //validate
        if (Objects.isNull(name) || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }

        if (Objects.isNull(email) || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요");
        }
    }
}
