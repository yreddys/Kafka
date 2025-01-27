package com.kafka_poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka_poc.model.Student;
import com.kafka_poc.service.kafkaService;

@RestController
public class kafkaController {
	@Autowired
	private kafkaService service;

	@PostMapping("/send")
	public String sendMessage(@RequestBody Student message) {
		service.msg(message);
		return "Message sent: " + message;
	}

}
