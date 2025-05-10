package com.ncart.pc.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
public class PersonRequestType implements Serializable {

    @JsonProperty("payload")
    private PersonPayloadType payload;
}
