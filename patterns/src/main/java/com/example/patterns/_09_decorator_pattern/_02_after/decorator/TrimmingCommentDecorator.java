package com.example.patterns._09_decorator_pattern._02_after.decorator;

import com.example.patterns._09_decorator_pattern._02_after.CommentService;

public class TrimmingCommentDecorator extends CommentDecorator {

    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("!", "~");
    }
}
