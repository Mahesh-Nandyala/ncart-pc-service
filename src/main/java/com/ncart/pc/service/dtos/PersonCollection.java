package com.ncart.pc.service.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ncart.pc.service.models.PersonType;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "persons")
@Data
public class PersonCollection {

    private String transactionId;
    private Audit audit;
    private List<PersonType> persons;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public List<PersonType> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonType> persons) {
        this.persons = persons;
    }
}
