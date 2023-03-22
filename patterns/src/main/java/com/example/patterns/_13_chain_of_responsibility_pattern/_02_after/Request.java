package com.example.patterns._13_chain_of_responsibility_pattern._02_after;

import java.time.LocalDate;
import lombok.Getter;

@Getter
public class Request {

    private String time;
    private String body;

    public Request(String body) {
        this.body = body;
        this.time = LocalDate.now().toString();
    }
}
