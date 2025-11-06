package com.notification.Notification_Service.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.common.vo.UserEvent;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KafkaConsumer {

	private final ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = "user-events", groupId = "bloodbank")
    public void consume(String message) {
        try {
            UserEvent event = objectMapper.readValue(message, UserEvent.class);

            System.out.println("🔥 Received event from Kafka");
            System.out.println("EventType: " + event.getEventType());
            System.out.println("User: " + event.getUserId());
            System.out.println("Email: " + event.getEmail());
            System.out.println("Message: " + event.getMessage());

            // TODO: send email / SMS here
        } catch (Exception e) {
            System.out.println("Error parsing message");
        }
    }
}
