package com.notification.Notification_Service.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

    @Bean
    JavaMailSender javaMailSender() {
        JavaMailSenderImpl mail = new JavaMailSenderImpl();
        mail.setHost("smtp-relay.brevo.com");
        mail.setPort(587);
        mail.setUsername("reddymanadadideekshith@gmail.com");
        mail.setPassword("xsmtpsib--CNiuW1eGGlbV6CKb");
        Properties props = mail.getJavaMailProperties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        return mail;
    }
}
