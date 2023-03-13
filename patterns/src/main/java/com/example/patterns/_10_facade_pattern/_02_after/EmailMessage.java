package com.example.patterns._10_facade_pattern._02_after;

import lombok.Getter;

@Getter
public class EmailMessage {

    private String from;
    private String to;
    private String subject;
    private String text;

    public EmailMessage(String from, String to, String subject, String text) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.text = text;
    }
}
