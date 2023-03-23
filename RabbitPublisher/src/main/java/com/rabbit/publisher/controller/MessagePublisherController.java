package com.rabbit.publisher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.publisher.service.MessagePublisherService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/messages")
@Slf4j
@AllArgsConstructor
public class MessagePublisherController {


    
    @Autowired
    private MessagePublisherService messagePublisherService;

    @PostMapping
    public void sendMessage(@RequestBody String message) {
    	messagePublisherService.sendMessage(message);
        log.info("Message sent to RabbitMQ: {}", message);
    }

}