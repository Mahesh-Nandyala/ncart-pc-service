package com.ncart.pc.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class PersonResponseType {

    @JsonProperty("transaction")
    private TransactionType transaction;
    @JsonProperty("persons")
    private List<PersonType> persons;
    @JsonProperty("responseStatus")
    private ResponseStatusType responseStatus;

    public TransactionType getTransaction() {
        return transaction;
    }

    public void setTransaction(TransactionType transaction) {
        this.transaction = transaction;
    }

    public List<PersonType> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonType> persons) {
        this.persons = persons;
    }

    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    public PersonResponseType() {
    }
}




