package com.dkafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
class Consumer {
    @KafkaListener(topics = "${kafka.topic}", groupId = "${kafka.groupId}")
    public void receive(String payload) {
        System.out.println(payload);
    }
}
