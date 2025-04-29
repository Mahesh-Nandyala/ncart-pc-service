package com.ncart.pc.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PersonPayloadType implements Serializable {

    @JsonProperty("persons")
    private List<PersonType> persons;

    public List<PersonType> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonType> persons) {
        this.persons = persons;
    }

    public PersonPayloadType() {
    }
}
