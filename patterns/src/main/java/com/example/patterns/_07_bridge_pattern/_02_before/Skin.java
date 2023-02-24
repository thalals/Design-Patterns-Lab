package com.example.patterns._07_bridge_pattern._02_before;

//기존에는, Champion 계층구조를 변경했어야 했는데
// Skin 을 다른 걔층구조로 나눔으로써, 다른 계층구조를 건드리지 않고 확장이 가능해짐
public interface Skin {

    String getName();
}
