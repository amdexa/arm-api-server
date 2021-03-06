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
import com.amdexa.example.arm.model.common.QueryPredicate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Component
public interface ConsumerService {
    Consumer saveConsumer(Consumer student);

    Optional<Consumer> findById(long id);

    Consumer updateConsumer(Consumer student);

    List<Consumer> listConsumers();

    List<Consumer> findByCriteria(Set<QueryPredicate> queryPredicates);
}
