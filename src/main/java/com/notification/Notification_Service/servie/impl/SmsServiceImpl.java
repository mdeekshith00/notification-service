package com.notification.Notification_Service.servie.impl;

import org.springframework.stereotype.Service;

import com.notification.Notification_Service.service.SmsService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.Notification;
import com.twilio.rest.lookups.v1.PhoneNumber;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SmsServiceImpl implements SmsService{
	
//  @Value("${twilio.account.sid}")
  private String accountSid;
//  @Value("${twilio.auth.token}") 
  private String authToken;
//  @Value("${twilio.phone.number}")
  private String from;
//	
//  public void sendSms(Notification request) {
//  Twilio.init(accountSid, authToken);
//  Message.creator(
//          new PhoneNumber(request.getTo()),
//          new PhoneNumber(from),
//          request.getMessage()
//  ).create();
//}

}

//
//@Configuration
//@EnableKafka
//public class KafkaConsumerConfig {
//
//    @Bean
//    public ConsumerFactory<String, NotificationRequest> consumerFactory() {
//        Map<String, Object> config = new HashMap<>();
//        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        config.put(ConsumerConfig.GROUP_ID_CONFIG, "notification-group");
//        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//        config.put(JsonDeserializer.TRUSTED_PACKAGES, "com.bloodbank.notificationservice.dto");
//        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
//                new JsonDeserializer<>(NotificationRequest.class, false));
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, NotificationRequest> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, NotificationRequest> factory =
//                new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }
//}

