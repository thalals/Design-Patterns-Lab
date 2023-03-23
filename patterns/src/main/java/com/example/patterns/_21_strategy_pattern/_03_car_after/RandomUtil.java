package com.example.patterns._21_strategy_pattern._03_car_after;

import java.util.Random;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RandomUtil {

    private static final Random random = new Random();

    public static int getNumber() {
        return random.nextInt(10);
    }
}
