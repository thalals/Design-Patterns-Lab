package com.example.patterns._12_proxy_pattern._03_after;

//인터페이스로 수정해 더 유연하게 코드를 변경할 수 있음 (복잡하지만)
public interface GameService {

    void startGame() throws InterruptedException;
}
