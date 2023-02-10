package com.example.patterns._04_builder_pattern;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        TourPlanBuilder builder = new DefaultTourBuilder();

        TourPlan plan = builder.title("칸쿤여행")
            .nightsAndDays(2, 3)
            .startDate(LocalDate.of(2020, 10, 2))
            .whereToStay("hotel")
            .addPlan(0, "저녁 식사")
            .addPlan(1, "아침 식사")
            .getPlan();

        TourPlan longBeachTrip = builder.title("롱비치")
            .startDate(LocalDate.now())
            .getPlan();

        TourPlan tourPlan = DefaultTourBuilder.Builder("title").getPlan();
    }
}
