package com.amdexa.example.arm.service;

import com.amdexa.example.arm.dao.model.Consumer;
import com.amdexa.example.arm.dao.repository.ConsumerAccountRepository;
import com.amdexa.example.arm.dao.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
    public Optional<Consumer> findById(long id) {
        return consumerRepository.findById(id);
    }

    @Override
    @Transactional
    public Consumer updateConsumer(Consumer consumer) {
        return consumerRepository.save(consumer);
    }

    @Override
    public List<Consumer> listConsumers() {
        return StreamSupport.stream(consumerRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public List<Consumer> findByCriteria(Map<String, String> criteria) {
        return consumerRepository.findAll((Specification<Consumer>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if(null != criteria){
                criteria.forEach((key, value) -> {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get(key), value)));
                });
            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        });
    }
}
