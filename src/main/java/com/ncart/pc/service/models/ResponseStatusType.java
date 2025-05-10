package com.ncart.pc.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseStatusType {

    @JsonProperty("responseStatusDescription")
    private String responseStatusDescription;
    @JsonProperty("responseStatusCode")
    private String responseStatusCode;

}
