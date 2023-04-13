package com.example.patterns._19_observer_pattern._01_before;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User(chatServer);
        user1.sendMessage("디자인 패턴", "이건 옵저버패턴 예시 입니다.");
        user1.sendMessage("전여자친구", "사랑은.. 돌아오는거야 !");

        User user2 = new User(chatServer);
        System.out.println(user2.getMessage("디자인 패턴"));

        user1.sendMessage("디자인 패턴", "이제 코드 보는중 ..");
        System.out.println(user2.getMessage("디자인 패턴"));

    }
}
