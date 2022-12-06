package com.example.kafkaconsumer.consumers;

import com.example.kafkaconsumer.configs.KafkaConfiguration;
import com.example.kafkaconsumer.services.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaConsumer {

    private final MessageService messageService;

    @KafkaListener(id = KafkaConfiguration.LISTENER_ID, topics = KafkaConfiguration.KAFKA_TOPIC)
    private void listen(String message){
        messageService.printMessage(message);
    }
}
