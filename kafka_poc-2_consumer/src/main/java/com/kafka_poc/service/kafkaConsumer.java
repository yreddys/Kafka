package com.kafka_poc.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka_poc.model.Student;

@Service
public class kafkaConsumer {
	@KafkaListener(topics = "reddy")
	public void listen(Student message) {
		System.out.println("Received: " + message.toString());

	}
}
