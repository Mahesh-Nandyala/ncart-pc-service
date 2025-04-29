package com.ncart.pc.service.dao;

import com.ncart.pc.service.dtos.Audit;
import com.ncart.pc.service.dtos.PersonCollection;
import com.ncart.pc.service.models.EmailType;
import com.ncart.pc.service.models.PersonType;
import com.ncart.pc.service.repository.PersonsRepo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {

    private final PersonsRepo personsRepo;

    public PersonDao(PersonsRepo personsRepo) {
        this.personsRepo = personsRepo;
    }

    public PersonCollection savePersons(PersonCollection personCollection) {
        return personsRepo.save(personCollection);
    }

    private PersonCollection initializePersons() {
        PersonCollection personCollection = new PersonCollection();
        personCollection.setAudit(new Audit());
        List<PersonType> personTypes = new ArrayList<>();
        PersonType personType = new PersonType();
        personType.setAddresses(new ArrayList<>());
        personType.setEmail(new EmailType());
        personType.setPhones(new ArrayList<>());
        personTypes.add(personType);
        personCollection.setPersons(personTypes);
        return personCollection;
    }


}
