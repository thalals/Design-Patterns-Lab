package com.example.patterns._19_observer_pattern._01_before;

import java.util.List;

public class User {

    private final ChatServer chatServer;

    public User(ChatServer chatServer) {
        this.chatServer = chatServer;
    }

    public void sendMessage(String subject, String message) {
        chatServer.add(subject, message);
    }

    public List<String> getMessage(String subject) {
        return chatServer.getMessage(subject);
    }
}
