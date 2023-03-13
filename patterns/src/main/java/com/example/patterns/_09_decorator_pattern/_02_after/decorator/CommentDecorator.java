package com.example.patterns._09_decorator_pattern._02_after.decorator;

import com.example.patterns._09_decorator_pattern._02_after.CommentService;

public class CommentDecorator implements CommentService {

    private CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
