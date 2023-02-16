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

    //공변 → Object.class 는 명시적으로 상속받고 있지않아도 객체 생성시 상속을 받음
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

