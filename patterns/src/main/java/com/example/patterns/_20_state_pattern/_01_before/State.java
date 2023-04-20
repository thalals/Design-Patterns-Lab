package com.example.patterns._20_state_pattern._01_before;

public enum State{
    DRAFT,
    PUBLISHED,
    PRIVATE;

    public boolean isDraft() {
        return this == State.DRAFT;
    }

    public boolean isPublished() {
        return this == State.PUBLISHED;
    }

    public boolean isPrivate() {
        return this == State.PRIVATE;
    }
}

