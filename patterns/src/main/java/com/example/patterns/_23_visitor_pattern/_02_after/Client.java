package com.example.patterns._23_visitor_pattern._02_after;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device device = new Phone();

        //상위 타입인 device 가 지원이 되지 않음
        rectangle.printTo(device);



    }
}
