package com.ncart.pc.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class PersonRequestType implements Serializable {

    @JsonProperty("payload")
    private PersonPayloadType payload;

}
