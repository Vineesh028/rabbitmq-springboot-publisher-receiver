package com.rabbit.publisher.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagePublisherService {

    public static final String ROUTING_KEY = "test";

    @Autowired
    private RabbitTemplate rabbitTemplate;

	public void sendMessage(String message) {
		 rabbitTemplate.convertAndSend(ROUTING_KEY, message);
		
	}
}
