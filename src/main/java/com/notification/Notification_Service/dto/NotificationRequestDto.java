package com.notification.Notification_Service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationRequestDto {

	 private String type;      // EMAIL, SMS, PUSH
	    private String to;        // recipient (email, phone, or FCM token)
	    private String subject;   // email/push title
	    private String message;   // message body
	    private Long userId;      // optional, if you want to map to user
}
