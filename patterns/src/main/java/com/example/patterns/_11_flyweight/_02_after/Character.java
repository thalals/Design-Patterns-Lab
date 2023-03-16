package com.example.patterns._11_flyweight._02_after;

//자주 바뀌는 객체와 안바뀌는 객체를 판단하는게 중요함
public class Character {

    private char value;
    private String color;
    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
