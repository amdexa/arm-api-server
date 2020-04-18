package com.amdexa.misc.arm.service;

import com.amdexa.misc.arm.dao.model.Consumer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ConsumerService {
    Consumer saveConsumer(Consumer student);

    Consumer findById(long id);

    Consumer updateConsumer(Consumer student);

    List<Consumer> listConsumers();
}
