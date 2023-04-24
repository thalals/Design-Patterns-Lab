package com.example.patterns._22_template_method_pattern._02_after;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor_plus = new Plus("number.txt");
        int plus_result = fileProcessor_plus.process();
        System.out.println(plus_result);


        FileProcessor fileProcessor_minus = new Minus("number.txt");
        int minus_result = fileProcessor_minus.process();
        System.out.println(minus_result);
    }
}
