package com.ncart.pc.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PersonResponseType {

    @JsonProperty("transaction")
    private TransactionType transaction;
    @JsonProperty("persons")
    private List<PersonType> persons;
    @JsonProperty("responseStatus")
    private ResponseStatusType responseStatus;

}




