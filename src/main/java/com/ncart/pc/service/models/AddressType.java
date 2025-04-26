package com.ncart.pc.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class AddressType implements Serializable {

    @JsonProperty("addressType")
    private String addressType;
    @JsonProperty("houseNumber")
    private String houseNumber;
    @JsonProperty("streetAddress")
    private String streetAddress;
    @JsonProperty("area")
    private String area;
    @JsonProperty("district")
    private String district;
    @JsonProperty("zipCode")
    private String zipCode;
    @JsonProperty("state")
    private String state;


}
