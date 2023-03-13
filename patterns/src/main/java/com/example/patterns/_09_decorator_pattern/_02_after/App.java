package com.example.patterns._09_decorator_pattern._02_after;

import com.example.patterns._09_decorator_pattern._02_after.decorator.SpamFilteringCommentDecorator;
import com.example.patterns._09_decorator_pattern._02_after.decorator.TrimmingCommentDecorator;

/**
 *  데코레이터패턴을 사용하여 상속이 아닌 위임으로 문제를 해결
 */
public class App {

    private static boolean enabledSpamFilter = true;
    private static boolean enableTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enableTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어 게입 수위 미쳤다ㄷㄷ → http://광고광고.com");
        client.writeComment("내가 왕이 될 상인가");
        client.writeComment("내가임마!!! 어이!!");

    }
}
