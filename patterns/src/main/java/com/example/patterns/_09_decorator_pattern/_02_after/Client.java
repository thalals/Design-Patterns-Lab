package com.example.patterns._09_decorator_pattern._02_after;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {

        commentService.addComment(comment);
    }
}
