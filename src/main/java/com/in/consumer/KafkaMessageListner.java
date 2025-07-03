package com.in.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListner {

	Logger LOG = LoggerFactory.getLogger(KafkaMessageListner.class);
	
	@KafkaListener(topics = "kafka-topic-demo2", groupId = "ktd-group2")
	public void consume(String message) {
		LOG.info("Consumer consumer the message {} ", message);
	}
}
