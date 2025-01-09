package com.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {
	@KafkaListener(topics = "Reddy")
	public void listen(String message) {
		System.out.println("Received: " + message);

	}
}
