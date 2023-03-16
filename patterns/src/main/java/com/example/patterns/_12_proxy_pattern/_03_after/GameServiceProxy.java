package com.example.patterns._12_proxy_pattern._03_after;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
