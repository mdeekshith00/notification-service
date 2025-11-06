package com.notification.Notification_Service.servie.impl;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserEventConsumer {

	   private final EmailServiceImpl emailService;
	   
	   @KafkaListener(topics = "user-events", groupId = "bloodbank")
	    public void listen(String message) {
	        System.out.println("📩 Received: " + message);

	        // Parse message JSON → extract email + data
	        String email = "test@gmail.com";   // TODO: from message
	        String subject = "User Notification";
	        String html = """
	                <h2>Hello!</h2>
	                <p>Your profile was updated.</p>
	                """;

	        emailService.sendEmail(email, subject, html);
	    }
}
