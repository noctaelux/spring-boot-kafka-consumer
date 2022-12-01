package com.example.kafkaconsumer.consumers;

import com.example.kafkaconsumer.configs.KafkaConfiguration;
import com.example.kafkaconsumer.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @Autowired
    MessageService messageService;

    @KafkaListener(id = KafkaConfiguration.LISTENER_ID, topics = KafkaConfiguration.TOPIC)
    private void listen(String message){
        messageService.printMessage(message);
    }
}
