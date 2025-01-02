package com.example.kafka.consumer;

import com.example.kafka.dao.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "${kafka.topic.message}", groupId = "${kafka.group.message}")
    public void listenObject(Message message) {
        logger.info("Received Object: {} {}", message.getId(), message.getContent());
    }
}
