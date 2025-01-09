package com.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
	@Autowired
	private KafkaTemplate<String, String> kafka;

	public void message(String msg) {
		kafka.send("Reddy", msg);
	}

}
