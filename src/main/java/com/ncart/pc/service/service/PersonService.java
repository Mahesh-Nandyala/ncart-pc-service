package com.ncart.pc.service.service;

import com.ncart.pc.service.constants.NCartConstants;
import com.ncart.pc.service.dao.PersonDao;
import com.ncart.pc.service.dtos.Audit;
import com.ncart.pc.service.dtos.PersonCollection;
import com.ncart.pc.service.models.EmailType;
import com.ncart.pc.service.models.PersonPayloadType;
import com.ncart.pc.service.models.PersonRequestType;
import com.ncart.pc.service.models.PersonResponseType;
import com.ncart.pc.service.models.PersonType;
import com.ncart.pc.service.models.ResponseStatusType;
import com.ncart.pc.service.models.TransactionType;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;


@Service
public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public PersonResponseType processPersons(Map<String, Object> valueMap) {
        PersonCollection personCollection = initializePersons();
        PersonRequestType personRequestType = (PersonRequestType) valueMap.get(NCartConstants.ProcessKeys.REQUEST_BODY);

        //set up the personId
        Optional.of(personRequestType).map(PersonRequestType::getPayload)
                .map(PersonPayloadType::getPersons).orElse(new ArrayList<>()).forEach(personType ->
                personType.setPersonId(UUID.randomUUID().toString()));

        Audit audit = new Audit();
        audit.setUserId((String) valueMap.get(NCartConstants.Headers.USER_ID));
        audit.setCreationDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS")));
        audit.setLastModifiedDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS")));

        //transactionId
        personCollection.setTransactionId(UUID.randomUUID().toString());
        personCollection.setPersons(personRequestType.getPayload().getPersons());
        personCollection.setAudit(audit);

        personCollection = personDao.savePersons(personCollection);

        PersonResponseType personResponseType = new PersonResponseType();
        personResponseType.setTransaction(new TransactionType());
        personResponseType.setResponseStatus(new ResponseStatusType());
        personResponseType.setPersons(new ArrayList<>());
        personResponseType.getTransaction().setTransactionId(personCollection.getTransactionId());
        personResponseType.setPersons(personCollection.getPersons());
        personResponseType.getResponseStatus().setResponseStatusCode("200");
        personResponseType.getResponseStatus().setResponseStatusDescription("Person has been added successfully");

        return personResponseType;
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
