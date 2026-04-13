package com.example.pulsardemo;

import org.apache.pulsar.client.api.*;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {
    private final Producer<String> producer;

    public MessageProducer() throws Exception {
        PulsarClient client = PulsarClient.builder()
                .serviceUrl("pulsar://localhost:6650")
                .build();

        this.producer = client.newProducer(Schema.STRING)
                .topic("my-topic")
                .create();
    }

    public void sendMessage(String key, String msg) {
        try {
            // OLD CODE (simple send)
            /*
            producer.send(msg);
            */

            // ✅ NEW: Function-friendly message (with key + properties)
            producer.newMessage()
                    .key(key)
                    .value(msg)
                    .property("source", "spring-boot")
                    .send();

            System.out.println("Sent msg: '" + msg + "' with key: '" + key + "'");
        } catch (PulsarClientException e) {
            e.printStackTrace();
        }
    }
}