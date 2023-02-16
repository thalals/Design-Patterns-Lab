package com.example.patterns._05_prototype_pattern;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
public class GithubIssue implements Cloneable {

    private int id;
    private String title;

    @Override
    public GithubIssue clone() {
        try {
            GithubIssue clone = (GithubIssue) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

