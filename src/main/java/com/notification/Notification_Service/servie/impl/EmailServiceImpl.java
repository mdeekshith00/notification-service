package com.notification.Notification_Service.servie.impl;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.notification.Notification_Service.service.EmailService;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService{


	 private final JavaMailSender mailSender;
//
//	    public void sendEmail(NotificationRequestDto request) {
//	        SimpleMailMessage message = new SimpleMailMessage();
//	        message.setTo(request.getTo());
//	        message.setSubject(request.getSubject());
//	        message.setText(request.getMessage());
//	        mailSender.send(message);
//	    }
//	
	    public void sendEmail(String to, String subject, String htmlContent) {
	        try {
	            MimeMessage message = mailSender.createMimeMessage();
	            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");

	            helper.setTo(to);
	            helper.setSubject(subject);
	            helper.setText(htmlContent, true);
	            helper.setFrom("no-reply@yourdomain.com"); // Recommended

	            mailSender.send(message);
	            System.out.println("✅ Email sent to: " + to);

	        } catch (MessagingException e) {
	            e.printStackTrace();
	            throw new RuntimeException("❌ Email sending failed: " + e.getMessage());
	        }
	    }

}
