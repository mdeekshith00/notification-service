package com.notification.Notification_Service.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.common.vo.NotificationEvent;
import com.notification.Notification_Service.service.EmailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationConsumer {
	
	private final EmailService emailService;


    @KafkaListener(topics = "email-topic", groupId = "bloodbank")
    public void consume(NotificationEvent event) {
        log.info("✅ Received event: {}", event);

        emailService.sendEmail(event.getTo(), event.getSubject(), event.getMessage());
    }

}
