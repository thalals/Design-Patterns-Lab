package com.example.patterns._07_bridge_pattern._01_before;

import com.example.patterns._07_bridge_pattern._02_before.Skin;

// 챔피온이란 추상 객체에 skin 뿐만아니라, skill, 특징 등등 계층구조에 추가될수록 무거워짐 (수많은 클래스가 추가됨)
// 따라서, 또 다른 차원의 액션들을 분리해서 다른 추상 객체로 만들어서 이런 문제에서 벗어나느것이 브릿지 패턴
public interface Champion extends Skin {

    void move();

    void skillQ();

    void skillW();

    void skillE();

    void skillR();

}
