package com.kafka_poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.messaging.Message;
import com.kafka_poc.model.Student;

@Service
public class kafkaService {
	@Autowired
	private KafkaTemplate<String, Student> kafka;
//
//	public void message(String msg) {
//		kafka.send("Reddy", msg);
//
//	}

	public void msg(Student student) {
		Message<Student> message = MessageBuilder
				.withPayload(student)
				.setHeader(KafkaHeaders.TOPIC, "reddy").build();
		kafka.send(message);
	}

}
