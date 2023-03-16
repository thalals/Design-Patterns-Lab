package com.example.patterns._12_proxy_pattern._02_after;

public class Client {

    // 기존
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();

    }
}
