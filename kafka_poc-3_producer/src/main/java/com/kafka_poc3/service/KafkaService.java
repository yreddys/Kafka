package com.kafka_poc3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.kafka_poc3.model.Student;
import com.kafka_poc3.repo.StudentRepository;

@Service
public class KafkaService {
	@Autowired
	private KafkaTemplate<String, Student> kafka;
	@Autowired
	private StudentRepository studentRepository;

	public void msg(Student student) {
		studentRepository.save(student);
		Message<Student> message = MessageBuilder.withPayload(student).setHeader(KafkaHeaders.TOPIC, "reddy").build();
		kafka.send(message);
	}
}
