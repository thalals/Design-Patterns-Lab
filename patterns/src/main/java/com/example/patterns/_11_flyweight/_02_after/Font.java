package com.example.patterns._11_flyweight._02_after;

/**
 *   flyweight 객체
 *  flyweight 객체는 불변한 객체이야 한다. → 변하지 않는 객체로 판단해서 flyweight 객체로 빼서 모든 곳에서 공유하기 때문에 불변해야함
 */
public final class Font {
    private final String family;
    private final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }
}
