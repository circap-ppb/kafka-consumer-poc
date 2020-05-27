package com.flutter.smf.cbb.kafkapoc.consumer;

import com.flutter.smf.cbb.kafkapoc.service.GameScheduledService;
import com.flutter.smf.se.bb.game.contract.Game;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.AcknowledgingMessageListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GameScheduledConsumer implements AcknowledgingMessageListener<String, Game> {

    @Autowired
    private GameScheduledService gameScheduledService;

    @Override
    @KafkaListener(topics = {"cbb-game-events"})
    public void onMessage(ConsumerRecord<String, Game> consumerRecord, Acknowledgment acknowledgment) {
        log.info("ConsumerRecord : {} ", consumerRecord);
        gameScheduledService.processgameShcedule(consumerRecord);
        acknowledgment.acknowledge();
    }
}
