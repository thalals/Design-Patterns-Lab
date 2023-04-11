package com.example.patterns._18_memento_pattern._02_after;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave save = game.save();

        game.setBlueTeamScore(12);
        game.setRedTeamScore(22);

        //저장된 시점으로 복원
        game.restore(save);

    }
}
