package com.amdexa.misc.arm.service;

import com.amdexa.misc.arm.dao.model.Consumer;
import com.amdexa.misc.arm.dao.repository.ConsumerAccountRepository;
import com.amdexa.misc.arm.dao.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    @Autowired
    private ConsumerAccountRepository consumerAccountRepository;

    @Override
    @Transactional
    public Consumer saveConsumer(Consumer consumer) {
        return consumerRepository.save(consumer);
    }

    @Override
    @Transactional
    public Consumer findById(long id) {
        return consumerRepository.findById(id);
    }

    @Override
    @Transactional
    public Consumer updateConsumer(Consumer consumer) {
        return consumerRepository.save(consumer);
    }
}
