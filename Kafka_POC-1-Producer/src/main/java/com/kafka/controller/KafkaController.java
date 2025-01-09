package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.KafkaService;

@RestController
public class KafkaController {
	@Autowired
	private KafkaService kService;

	@PostMapping("/send")
	public String sendMessage(@RequestBody String message) {
		kService.message(message);
		return "Message sent: " + message;
	}

}
