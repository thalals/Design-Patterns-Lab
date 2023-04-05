package com.example.patterns._16_iterator_pattern._01_before;

import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습~ㄱ?");
        board.addPost("지금 이자리에 계신 여러분들은 모두 디자인 패턴 학습 ㄱㄱ");

        //TODO 들어간 순서대로 순회하기 → 클라이언트가 보드가 list 의 구조라는 것을 알고있어야 하는 순회 → list 타입이 stack 이나 다른 무엇인가로 변경된다면 클라이언트 코드도 변경되어야함
        List<Post> posts = board.getPosts();
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        //TODO 가장 최신 글 먼저 순회하기
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
    }
}
