/*
 * Copyright (c) 2020 Amdexa. (https://amdexa.com) All Rights Reserved.
 *
 * Amdexa licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.amdexa.example.arm.service;

import com.amdexa.example.arm.dao.model.Consumer;
import com.amdexa.example.arm.dao.repository.ConsumerAccountRepository;
import com.amdexa.example.arm.dao.repository.ConsumerRepository;
import com.amdexa.example.arm.model.common.QueryPredicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
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
    public List<Consumer> findByCriteria(Set<QueryPredicate> criteria) {
        return consumerRepository.findAll((Specification<Consumer>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (null != criteria) {
                criteria.forEach(c -> {
                    switch (c.getOperator()) {
                        case ">":
                            predicates.add(criteriaBuilder.and(
                                    criteriaBuilder.greaterThan(root.get(c.getField()), c.getValue())));
                            break;
                        case "<":
                            predicates.add(criteriaBuilder.and(
                                    criteriaBuilder.lessThan(root.get(c.getField()), c.getValue())));
                            break;
                        default:
                            predicates.add(criteriaBuilder.and(
                                    criteriaBuilder.equal(root.get(c.getField()), c.getValue())));
                    }
                });
            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        });
    }
}
