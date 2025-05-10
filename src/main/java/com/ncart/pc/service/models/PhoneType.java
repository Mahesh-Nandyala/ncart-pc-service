package com.ncart.pc.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class PhoneType implements Serializable {

    @JsonProperty("phoneType")
    private String phoneType;
    @JsonProperty("phoneNumber")
    private String phoneNumber;

}
