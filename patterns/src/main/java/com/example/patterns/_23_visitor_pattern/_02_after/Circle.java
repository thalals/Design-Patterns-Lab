package com.example.patterns._23_visitor_pattern._02_after;

public class Circle implements Shape {


    @Override
    public void accept(Device device) {
        device.print(this);
    }

}


