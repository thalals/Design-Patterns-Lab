package com.example.patterns._04_builder_pattern;

import java.time.LocalDate;

public interface TourPlanBuilder {

    //메서드 체이닝 사용 → 인터페이스에서 정의한 또 다른 기능을 사용하기 위해서
    TourPlanBuilder title(String title);
    TourPlanBuilder nightsAndDays(int nights, int days);
    TourPlanBuilder startDate(LocalDate localDate);
    TourPlanBuilder whereToStay(String whereToStay);
    TourPlanBuilder addPlan(int day, String plan);


    //getPlan 을 호출하기 전가지는 계속 체이닝 사용 (마지막 단계이기에 검증하기 좋은 위치)
    TourPlan getPlan();
}
