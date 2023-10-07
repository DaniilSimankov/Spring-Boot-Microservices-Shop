package ru.orderservice.config;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration(proxyBeanMethods = false)
@RequiredArgsConstructor
public class ManualConfiguration {

    private final KafkaTemplate kafkaTemplate;

    @PostConstruct
    void setUp(){
        this.kafkaTemplate.setObservationEnabled(true);
    }
}
