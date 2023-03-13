package com.example.patterns._10_facade_pattern._02_after;

import jakarta.mail.MessagingException;


public class Client {

    public static void main(String[] args) throws MessagingException {

        final EmailSettings emailSettings = new EmailSettings("127.0.0.1");
        final EmailFacade emailFacade = new EmailFacade(emailSettings);

        emailFacade.sendEmail(new EmailMessage(
                "hmin@namver.com",
                "google@naver.com",
                "Test Mail from Java Program",
                "message hi!"
            ));
    }
}
