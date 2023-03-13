package com.example.patterns._09_decorator_pattern._01_before;

/**
 *  상속으로 문제를 풀려고하니, 모든 경우의 수에 맞는 하위 클래스를 만들어주야하는 문제점이 있음
 */
public class TrimmingCommentService extends CommentService{

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("!", "~");
    }
}
