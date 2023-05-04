package com.example.patterns._23_visitor_pattern._02_after;

public interface Device {

    void print(Circle circle);

    void print(Triangle triangle);

    void print(Rectangle rectangle);

}
