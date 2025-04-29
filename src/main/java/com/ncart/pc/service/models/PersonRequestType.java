package com.ncart.pc.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "persons")
public class PersonRequestType implements Serializable {

    @JsonProperty("payload")
    private PersonPayloadType payload;

    public PersonRequestType(PersonPayloadType payload) {
        this.payload = payload;
    }

    public PersonPayloadType getPayload() {
        return payload;
    }

    public void setPayload(PersonPayloadType payload) {
        this.payload = payload;
    }

    public PersonRequestType() {
    }
}
