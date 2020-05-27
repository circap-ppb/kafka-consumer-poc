package com.flutter.smf.cbb.kafkapoc.service;

import com.flutter.smf.se.bb.game.contract.Game;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GameScheduledService {

    public void processgameShcedule(ConsumerRecord<String, Game> consumerRecord){
        log.info("GameScheduled: {}", consumerRecord);
    }

}
