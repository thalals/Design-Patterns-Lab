package com.example.patterns._10_facade_pattern._02_after;

import jakarta.mail.Message.RecipientType;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailFacade {

    private EmailSettings emailSettings;

    public EmailFacade(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }

    public void sendEmail(EmailMessage emailMessage) throws MessagingException {

        final Properties properties = getProperties();
        final Session session = Session.getDefaultInstance(properties);
        final MimeMessage message = getMimeMessage(emailMessage, session);

        Transport.send(message);
    }

    private static MimeMessage getMimeMessage(EmailMessage emailMessage, Session session)
        throws MessagingException {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(emailMessage.getFrom()));
        message.addRecipient(RecipientType.TO, new InternetAddress(emailMessage.getTo()));
        message.setSubject(emailMessage.getSubject());
        message.setText(emailMessage.getText());
        return message;
    }

    private Properties getProperties() {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", emailSettings.getHost());
        return properties;
    }
}
