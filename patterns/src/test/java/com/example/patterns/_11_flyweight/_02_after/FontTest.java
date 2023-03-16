package com.example.patterns._11_flyweight._02_after;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FontTest {

    @Test
    void test() {
        Integer a = Integer.valueOf(129);
        Integer b = Integer.valueOf(129);

        System.out.println("a = b " + (a == b)) ;
    }
}