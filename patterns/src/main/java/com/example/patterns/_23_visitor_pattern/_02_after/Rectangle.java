package com.example.patterns._23_visitor_pattern._02_after;

public class Rectangle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
