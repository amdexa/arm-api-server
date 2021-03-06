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
package com.amdexa.example.arm.api;

import com.amdexa.example.arm.dao.model.Address;
import com.amdexa.example.arm.dao.model.Consumer;
import com.amdexa.example.arm.model.AccountResponse;
import com.amdexa.example.arm.model.AccountSearchRequest;
import com.amdexa.example.arm.model.ConsumerResponse;
import com.amdexa.example.arm.service.ConsumerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Controller
public class AccountAPIController implements AccountAPI {

    private static final Logger log = LoggerFactory.getLogger(AccountAPIController.class);

    private final HttpServletRequest request;

    private final ObjectMapper objectMapper;

    private final ModelMapper modelMapper;

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    public AccountAPIController(ObjectMapper objectMapper, HttpServletRequest request, ModelMapper modelMapper) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.modelMapper = modelMapper;
        this.modelMapper.getConfiguration().setAmbiguityIgnored(true);
    }

    public ResponseEntity<AccountResponse> search(@ApiParam(value = "A unique session id for this login.", required = true) @RequestHeader(value = "authorization", required = true) String sessionId, @ApiParam(value = "The Account Search request body is a JSON Object follows the accountSearchRequest schema.  The object has the following properties:", required = true) @Valid @RequestBody AccountSearchRequest accountSearchRequest) {
        AccountResponse response = new AccountResponse();
        List<ConsumerResponse> consumers = consumerService.findByCriteria(accountSearchRequest.queryPredicates).stream()
                .map(getConsumerResponse())
                .collect(Collectors.toList());
        response.setConsumers(consumers);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @Override
    public ResponseEntity<ConsumerResponse> retrieveConsumer(@ApiParam(value = "A unique session id for this login.", required = true) @RequestHeader(value = "authorization", required = true) String sessionId,
                                                             @ApiParam(value = "consumer id to lookup", required = true) @PathVariable long id) {
        Optional<Consumer> consumer = consumerService.findById(id);
        if (consumer.isPresent()) {
            ConsumerResponse consumerResponse = getConsumerResponse().apply(consumer.get());
            return new ResponseEntity<>(consumerResponse, HttpStatus.OK);
        } else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<Object> createConsumer(@ApiParam(value = "A unique session id for this login.", required = true) @RequestHeader(value = "authorization", required = true) String sessionId,
                                                 @ApiParam(value = "consumer to create", required = true) @Valid @RequestBody ConsumerResponse consumerReq) {
        Consumer saveConsumer = consumerService.saveConsumer(getConsumer().apply(consumerReq));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(saveConsumer.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    private Function<Consumer, ConsumerResponse> getConsumerResponse() {
        return c -> {
            ConsumerResponse map = modelMapper.map(c, ConsumerResponse.class);
            //FIXME: City, State, PostalCode, Country should mapped via model mapper
            Address address = c.getAddress();
            map.setCity(address.getCity());
            map.setState(address.getState());
            map.setPostalCode(address.getPostalCode());
            map.setCountry(address.getCountry());
            return map;
        };
    }

    private Function<ConsumerResponse, Consumer> getConsumer() {
        return c -> {
            Consumer map = modelMapper.map(c, Consumer.class);
            Address address = map.getAddress();
            map.getSpouse().setConsumer(map);
            map.getAccounts().forEach(a -> {
                a.setConsumer(map);
                a.setId(null);
            });
            address.setConsumer(map);
            //FIXME: City, State, PostalCode, Country should mapped via model mapper
            address.setCity(c.getCity());
            address.setState(c.getState());
            address.setPostalCode(c.getPostalCode());
            address.setCountry(c.getCountry());
            return map;
        };
    }

}
