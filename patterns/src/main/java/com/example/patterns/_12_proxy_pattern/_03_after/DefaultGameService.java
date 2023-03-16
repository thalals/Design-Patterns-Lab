package com.example.patterns._12_proxy_pattern._03_after;

public class DefaultGameService implements GameService{

    @Override
    public void startGame() throws InterruptedException {
        System.out.println("이 자리에 오신 여러분 환영환영");
        Thread.sleep(3000);
    }
}
