package com.example.patterns._13_chain_of_responsibility_pattern._01_before;

import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class Request {

    private final String time;
    private final String body;

    public Request(String body) {
        this.body = body;
        this.time = LocalDateTime.now().toString();
    }
}
