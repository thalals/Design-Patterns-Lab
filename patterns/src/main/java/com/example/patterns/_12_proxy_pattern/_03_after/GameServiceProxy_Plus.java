package com.example.patterns._12_proxy_pattern._03_after;

public class GameServiceProxy_Plus implements GameService {

    private GameService gameService;


    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();

        //이런식의 lazy 로딩도 가능함

        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }

        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
