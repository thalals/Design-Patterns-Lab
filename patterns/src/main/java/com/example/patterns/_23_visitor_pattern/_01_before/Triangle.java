package com.example.patterns._23_visitor_pattern._01_before;

public class Triangle implements Shape{

    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("print Rectangle to Phone");
        }

        if (device instanceof Watch) {
            System.out.println("print Rectangle to Watch");
        }
    }
}
