package com.example.patterns._23_visitor_pattern._02_after;

//필요한 기능이 생기면 변경하지 않고 추가하면 됨
public class Watch implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("print Circle to Watch");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print Triangle to Watch");
    }

    @Override
    public void print(Rectangle rectangle) { System.out.println("print Rectangle to Watch");}
}
