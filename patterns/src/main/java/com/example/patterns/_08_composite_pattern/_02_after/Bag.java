package com.example.patterns._08_composite_pattern._02_after;

import java.util.LinkedList;
import java.util.List;
import lombok.Getter;

@Getter
public class Bag implements Component{

    private List<Component> components = new LinkedList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
