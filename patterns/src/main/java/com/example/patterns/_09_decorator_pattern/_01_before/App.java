package com.example.patterns._09_decorator_pattern._01_before;

public class App {

    public static void main(String[] args) {
        Client client = new Client(new CommentService());
        client.writeComment("오징어 게입 수위 미쳤다ㄷㄷ → http://광고광고.com");
        client.writeComment("내가 왕이 될 상인가");
        client.writeComment("내가임마!!! 어이!!");

        System.out.println("--------- ");
        Client trimClient = new Client(new TrimmingCommentService());
        trimClient.writeComment("오징어 게입 수위 미쳤다ㄷㄷ → http://광고광고.com");
        trimClient.writeComment("내가 왕이 될 상인가");
        trimClient.writeComment("내가임마!!! 어이!!");


        System.out.println("--------- ");
        Client spamFilterClient = new Client(new SpamFilteringCommentService());
        spamFilterClient.writeComment("오징어 게입 수위 미쳤다ㄷㄷ → http://광고광고.com");
        spamFilterClient.writeComment("내가 왕이 될 상인가");
        spamFilterClient.writeComment("내가임마!!! 어이!!");
    }
}
