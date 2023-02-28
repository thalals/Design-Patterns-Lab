package com.example.patterns._08_composite_pattern._01_before;

import java.util.List;
import lombok.Getter;

@Getter
public class Bag {

    private List<Item> items;

    public void add(Item item) {
        items.add(item);
    }
}
