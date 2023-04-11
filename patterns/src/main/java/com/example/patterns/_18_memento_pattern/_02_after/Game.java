package com.example.patterns._18_memento_pattern._02_after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {

    private int redTeamScore;
    private int blueTeamScore;

    public GameSave save() {
        return new GameSave(this.blueTeamScore, this.redTeamScore);
    }

    public void restore(GameSave gameSave) {
        this.blueTeamScore = gameSave.getBlueTeamScore();
        this.redTeamScore = gameSave.getRedTeamScore();
    }
}
