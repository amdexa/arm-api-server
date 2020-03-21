package com.amdexa.misc.arm.model.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(as=Predicate.class)
public interface Predicate {
    public String getField();
    public String getValue();
    public String getOperator();
    public boolean isInverse();

}
