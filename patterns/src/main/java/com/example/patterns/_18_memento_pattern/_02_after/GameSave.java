package com.example.patterns._18_memento_pattern._02_after;

import lombok.Getter;

//불변해야함
@Getter
public final class GameSave {

    private final int blueTeamScore;
    private final int redTeamScore;

    public GameSave(int blueTeamScore, int redTeamScore) {
        this.blueTeamScore = blueTeamScore;
        this.redTeamScore = redTeamScore;
    }
}
