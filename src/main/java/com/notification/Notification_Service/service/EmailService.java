package com.notification.Notification_Service.service;

public interface EmailService {

	void sendEmail(String email, String subject, String html);

}
