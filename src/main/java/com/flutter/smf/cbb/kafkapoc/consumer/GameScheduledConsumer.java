package com.flutter.smf.cbb.kafkapoc.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.AcknowledgingMessageListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GameScheduledConsumer implements AcknowledgingMessageListener<String, String> {

    @Override
    @KafkaListener(topics = {"cbb.gameui.events"})
    public void onMessage(ConsumerRecord<String, String> consumerRecord, Acknowledgment acknowledgment) {
        log.info("ConsumerRecord : {} ", consumerRecord);
        acknowledgment.acknowledge();
    }
}
