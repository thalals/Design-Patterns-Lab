package com.example.patterns._05_prototype_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class App {

    public static void main(String[] args) {

        GithubIssue githubIssue = new GithubIssue();
        githubIssue.setId(1);
        githubIssue.setTitle("title");

        //clone
        GithubIssue clone = githubIssue.clone();

        //todo 1. clone != gitHubIssue (다른 인스턴스가 새로 만들어짐)
        //todo 2. clone.equals(githubIssie) = true (값은 같아야함)

        System.out.println("clone != githubIssue = " + (clone != githubIssue));
        System.out.println("clone.equals(githubIssue) = " + clone.equals(githubIssue));
        System.out.println("clone.getClass() == githubIssue.getClass() = " + (clone.getClass() == githubIssue.getClass()));


        //clone 을 사용할 수 있지만 인터페이스를 반환하기위해 생성자 사용
        List<GithubIssue> originList = List.of(githubIssue, clone);
        List<GithubIssue> cloneList = new ArrayList<>(originList);


    }
}
