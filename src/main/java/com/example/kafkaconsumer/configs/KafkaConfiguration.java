package com.example.kafkaconsumer.configs;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {

    //Nombre del tópico
    public final static String TOPIC = "kafka-topic";

    public final static String LISTENER_ID = "listener-id";

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(TOPIC)
                .partitions(10)
                .replicas(1)
                .build();
    }
}
