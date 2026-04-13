package com.example.pulsardemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageProducer messageProducer;

    public MessageController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    // Update the endpoint to accept a 'key' query parameter
    @GetMapping("/api/send")
    public String sendMessage(
            @RequestParam("key") String key, 
            @RequestParam("msg") String msg) {
        
        messageProducer.sendMessage(key, msg);
        return "Message sent! Key: " + key + " | Value: " + msg;
    }
}