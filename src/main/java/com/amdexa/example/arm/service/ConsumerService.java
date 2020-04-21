package com.amdexa.example.arm.service;

import com.amdexa.example.arm.dao.model.Consumer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public interface ConsumerService {
    Consumer saveConsumer(Consumer student);

    Optional<Consumer> findById(long id);

    Consumer updateConsumer(Consumer student);

    List<Consumer> listConsumers();

    List<Consumer> findByCriteria(Map<String, String> criteria);
}
