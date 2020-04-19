package com.amdexa.example.arm.model.common;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class PredicateDeserializer extends StdDeserializer<Predicate> {

    public PredicateDeserializer() {
        this(null);
    }

    public PredicateDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Predicate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return new Predicate() {
            @Override
            public String getField() {
                return "test";
            }

            @Override
            public String getValue() {
                return "test";
            }

            @Override
            public String getOperator() {
                return "test";
            }

            @Override
            public boolean isInverse() {
                return false;
            }
        };
    }
}
