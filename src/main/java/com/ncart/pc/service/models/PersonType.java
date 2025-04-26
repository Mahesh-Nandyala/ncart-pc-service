package com.ncart.pc.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PersonType implements Serializable {

    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("age")
    private int age;
    @JsonProperty("maritalStatus")
    private String maritalStatus;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("occupation")
    private String occupation;
    @JsonProperty("dateOfBirth")
    private String dateOfBirth;
    @JsonProperty("addresses")
    private List<AddressType> addresses;
    @JsonProperty("phones")
    private List<PhoneType> phones;
    @JsonProperty("email")
    private EmailType email;

}
