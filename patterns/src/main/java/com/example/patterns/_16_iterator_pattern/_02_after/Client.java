package com.example.patterns._16_iterator_pattern._02_after;

import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        //TODO iterator 순회 내부가 List
        // Iterator 를 사용하면 보드 내부에 어떤 타입이 존재하는지 알지 않아도 됨
        Board board = new Board();
        addData(board);

        List<Post> posts = board.getPosts();
        Iterator<Post> iterator = posts.iterator();
        System.out.println(iterator.getClass());


        //TODO iterator 순회 내부가 Stack
        StackBoard stackBoard = new StackBoard();
        addData(stackBoard);

        List<Post> stackBoardPosts = stackBoard.getPosts();
        Iterator<Post> iterator2 = stackBoardPosts.iterator();
        System.out.println(iterator2.getClass());


        //TODO 가장 최신 글 먼저 순회하기
        // board 자체에서 순회하기 위한 Iterator 를 제공하는 방법
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while (recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }
    }

    private static void addData(Board board) {
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습~ㄱ?");
        board.addPost("지금 이자리에 계신 여러분들은 모두 디자인 패턴 학습 ㄱㄱ");
    }

    private static void addData(StackBoard board) {
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습~ㄱ?");
        board.addPost("지금 이자리에 계신 여러분들은 모두 디자인 패턴 학습 ㄱㄱ");
    }
}
