package com.example.patterns._23_visitor_pattern._02_after;

public interface Shape {

    //비지터로 디스페치 하기위한 기능
    void accept(Device device);
}
