package com.amdexa.misc.arm.service;

import com.amdexa.misc.arm.dao.model.Consumer;
import com.amdexa.misc.arm.dao.model.ConsumerAccount;
import com.amdexa.misc.arm.dao.repository.ConsumerAccountRepository;
import com.amdexa.misc.arm.dao.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    @Autowired
    private ConsumerAccountRepository consumerAccountRepository;

    @Override
    @Transactional
    public Consumer saveConsumer(Consumer consumer) {
        Set<ConsumerAccount> accounts = consumer.getAccounts();
        consumer.setAccounts(new HashSet<>());
        Consumer saved = consumerRepository.save(consumer);
        if(null != accounts) {
            accounts.forEach(acc -> {
                acc.setConsumer(saved);
                consumerAccountRepository.save(acc);
            });
        }
        return saved;
    }

    @Override
    @Transactional
    public Consumer findById(int id) {
        return consumerRepository.findById(id);
    }

    @Override
    @Transactional
    public Consumer updateConsumer(Consumer consumer) {
        return consumerRepository.save(consumer);
    }
}
