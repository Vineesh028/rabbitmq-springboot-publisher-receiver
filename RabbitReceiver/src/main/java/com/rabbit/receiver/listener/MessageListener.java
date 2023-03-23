package com.rabbit.receiver.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@AllArgsConstructor
public class MessageListener {

    public static final String ROUTING_KEY = "test";

    @RabbitListener(queues = ROUTING_KEY)
    public void listenerMessage(String message) {
        log.info("Received message from the RabbitMQ: {}", message);
    }

}
