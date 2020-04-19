package com.amdexa.example.arm.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import java.util.Set;

public abstract class PredictableRequest {

    @JsonProperty("predicates")
    @Valid
    public Set<Predicate> predicates;
}
