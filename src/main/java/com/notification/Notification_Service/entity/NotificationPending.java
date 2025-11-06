package com.notification.Notification_Service.entity;

import java.time.LocalDateTime;

import com.common.enums.ChannelType;
import com.common.enums.EventType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "notifications")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotificationPending {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private Long userId;
	    private String email;
	    private String phone;

	    private String subject;
	    private String message;
	    @Enumerated(EnumType.STRING)
	    private ChannelType channel;     // EMAIL, WHATSAPP, SMS
	    @Enumerated(EnumType.STRING)
	    private EventType eventType;   // USER_UPDATED etc

	    private String status;      // SUCCESS, FAILED, PENDING
	    private int retries;

	    private LocalDateTime createdAt;
	    private LocalDateTime sentAt;

}
