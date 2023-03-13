package com.example.patterns._09_decorator_pattern._02_after;

public class DefaultCommentService implements CommentService{

    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
