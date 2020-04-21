package com.amdexa.example.arm.model.common;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class Predicate {
    private String field;
    private String value;
    private String operator;
    private boolean inverse;
}
