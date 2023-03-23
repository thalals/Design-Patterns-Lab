package com.example.patterns._21_strategy_pattern._03_car_after;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    @DisplayName("랜덤한 숫자로 나오는 값이 4이상일 경우 차는 이동한다.")
    void test() {
        Car car = new Car();

        when(RandomUtil.getNumber()).thenReturn(5);
        car.go(RandomUtil.getNumber());

        assertThat(car.getNowMovementResult()).isEqualTo(1);
    }

}