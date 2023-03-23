package com.example.patterns._21_strategy_pattern._04_car_before;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.example.patterns._21_strategy_pattern._04_car_before.strategy.MoveStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    @DisplayName("랜덤한 숫자로 나오는 값이 4이상일 경우 차는 이동한다.")
    void test() {

        Car car = new Car();

        MoveStrategy moveStrategy = mock(MoveStrategy.class);
        when(moveStrategy.move()).thenReturn(1);

        //when
        car.go(moveStrategy);

        //then
        assertThat(car.getNowMovementResult()).isEqualTo(1);
    }
}