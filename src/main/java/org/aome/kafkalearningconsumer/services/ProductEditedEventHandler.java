package org.aome.kafkalearningconsumer.services;

import lombok.extern.slf4j.Slf4j;
import org.aome.kafkalearningconsumer.services.dto.ProductDto;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = "product-edited-events-topic")
@Slf4j
public class ProductEditedEventHandler {

    @KafkaHandler
    public void process(ProductDto productDto) {
        log.info("Processing product edited event: {}", productDto);
    }
}
