package com.example.patterns._23_visitor_pattern._02_after;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        Device phone = new Phone();
        Device watch = new Watch();

        //상위 타입인 device 가 지원이 되지 않음
        rectangle.accept(phone);
        rectangle.accept(watch);

        circle.accept(phone);
        circle.accept(watch);

        triangle.accept(phone);
        triangle.accept(watch);
    }
}
