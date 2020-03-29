package com.amdexa.misc.arm.service;

import com.amdexa.misc.arm.dao.model.Consumer;
import org.springframework.stereotype.Component;

@Component
public interface ConsumerService {
    Consumer saveConsumer(Consumer student);

    Consumer findById(int id);

    Consumer updateConsumer(Consumer student);
}
