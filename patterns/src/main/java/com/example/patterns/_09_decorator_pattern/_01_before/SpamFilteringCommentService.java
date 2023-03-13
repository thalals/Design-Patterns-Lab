package com.example.patterns._09_decorator_pattern._01_before;


public class SpamFilteringCommentService extends CommentService{

    @Override
    public void addComment(String comment) {
        if (isNotSpam(comment)) {
            super.addComment(comment);
        }
    }

    private boolean isNotSpam(String comment) {
        return !comment.contains("http");
    }
}
