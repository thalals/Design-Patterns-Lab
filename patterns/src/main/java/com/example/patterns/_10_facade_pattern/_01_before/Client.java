package com.example.patterns._10_facade_pattern._01_before;

import jakarta.mail.Message.RecipientType;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

/**
 *  Client 코드에 모든게 의존적인 코드
 *  1. message 상수
 *  2. message 세팅
 *  3. server 설정
 *  4. mail 전송
 *
 *  전부 Client 에 묶여있다.
 */
public class Client {

    public static void main(String[] args) {
        String to = "hmin@naver.com";
        String from = "google@naver.com";
        String host = "127.0.0.1";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(RecipientType.TO, new InternetAddress(to));
            message.setSubject("Test Mail from Java Program");
            message.setText("message hi!");

            Transport.send(message);
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
    }
}
