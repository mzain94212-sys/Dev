package com.example.pulsardemo;

import org.springframework.pulsar.annotation.PulsarListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @PulsarListener(
            topics = "my-topic",
            subscriptionName = "my-subscription"
    )
    public void listen(
            String msg,
            @Header("pulsar_message_key") String key
    ) {

        // OLD CODE
        /*
        System.out.println("✅ Received: " + msg);
        */

        // ✅ NEW: Function-style processing
        System.out.println("✅ Received Message: " + msg);
        System.out.println("🔑 Key: " + key);

        // Simulate processing (like Pulsar Function)
        String processed = msg.toUpperCase();

        System.out.println("⚙️ Processed Output: " + processed);
    }
}