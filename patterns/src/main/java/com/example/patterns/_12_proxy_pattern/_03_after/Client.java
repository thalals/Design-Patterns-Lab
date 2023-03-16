package com.example.patterns._12_proxy_pattern._03_after;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy(new DefaultGameService());
        gameService.startGame();

    }
}
