package com.ncart.pc.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class EmailType implements Serializable {

    @JsonProperty("emailType")
    private String emailType;
    @JsonProperty("emailAddress")
    private String emailAddress;
}
