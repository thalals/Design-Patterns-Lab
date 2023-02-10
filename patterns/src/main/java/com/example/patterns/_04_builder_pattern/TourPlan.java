package com.example.patterns._04_builder_pattern;

import java.time.LocalDate;
import java.util.List;

public class TourPlan {

    private String title;
    private int nights;
    private int days;
    private LocalDate startDate;
    private String whereToStay;
    private List<DetailPlan> plans;

    public TourPlan() {

    }

    public TourPlan(String title, int nights, int days, LocalDate startDate, String whereToStay,
        List<DetailPlan> plans) {
        this.title = title;
        this.nights = nights;
        this.days = days;
        this.startDate = startDate;
        this.whereToStay = whereToStay;
        this.plans = plans;
    }
}
