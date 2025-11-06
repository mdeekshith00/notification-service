package com.notification.Notification_Service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/email-service")
@RequiredArgsConstructor
public class EmailController {
 
	@PostMapping("/send-email")
	public void sendEmail(String email, String subject, String html) {
		// TODO Auto-generated method stub
		
	}

}
