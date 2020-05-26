package com.flutter.smf.cbb.kafkapoc.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GameScheduledService {

    public void processgameShcedule(ConsumerRecord<String, String> consumerRecord){
        log.info("GameScheduled: {}", consumerRecord);
    }

}
