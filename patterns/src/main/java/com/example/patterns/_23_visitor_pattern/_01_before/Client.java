package com.example.patterns._23_visitor_pattern._01_before;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        rectangle.printTo(new Watch());
        rectangle.printTo(new Phone());

        triangle.printTo(new Watch());
        triangle.printTo(new Phone());
    }
}
