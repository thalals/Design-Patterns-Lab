package com.example.patterns._19_observer_pattern._02_after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("keesun");
        User user2 = new User("helloMan");

        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);

        chatServer.register("디자인 패턴", user1);

        chatServer.sendMessage(user1, "오징어게임", "아 이름이 기억났어 ~~ 오일남이야");

        System.out.println();

        chatServer.sendMessage(user2, "디자인 패턴", "오저버 패턴으로 만든 패턴");

    }
}
