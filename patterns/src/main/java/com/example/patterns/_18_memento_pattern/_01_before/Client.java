package com.example.patterns._18_memento_pattern._01_before;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        //점수 저장 → 클라이언트가
        int redTeamScore = game.getRedTeamScore();
        int blueTeamScore = game.getBlueTeamScore();

        //값이 변경되었다가
        game.setRedTeamScore(12);
        game.setBlueTeamScore(22);

        //저장된 시점으로 복원
        Game restoreGame = new Game();
        restoreGame.setRedTeamScore(redTeamScore);
        restoreGame.setBlueTeamScore(blueTeamScore);
    }
}
