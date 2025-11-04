package com.notification.Notification_Service.servie.impl;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.notification.Notification_Service.dto.NotificationRequestDto;
import com.notification.Notification_Service.service.EmailService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService{


	 private JavaMailSender mailSender;

	    public void sendEmail(NotificationRequestDto request) {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(request.getTo());
	        message.setSubject(request.getSubject());
	        message.setText(request.getMessage());
	        mailSender.send(message);
	    }
	

}
