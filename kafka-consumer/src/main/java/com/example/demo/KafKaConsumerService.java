package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.howtodoinjava.kafka.demo.model.User;

@Service
public class KafKaConsumerService {
	private final Logger logger = LoggerFactory.getLogger(KafKaConsumerService.class);

	@KafkaListener(topics = AppConstants.TOPIC_NAME_USER_LOG, groupId = AppConstants.GROUP_ID)
	public String consume(User user) {
		// write email code here
		logger.info(String.format("received -> %s", user));
//		throw new RuntimeException();
		return "test";// ignored by message broker though it works
	}
}
