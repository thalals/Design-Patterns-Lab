package com.example.patterns._08_composite_pattern._02_after;

import lombok.Getter;

@Getter
public class Item implements Component{

    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
