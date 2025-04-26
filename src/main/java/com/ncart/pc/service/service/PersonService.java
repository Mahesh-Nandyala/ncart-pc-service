package com.ncart.pc.service.service;

import com.ncart.pc.service.models.PersonRequestType;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PersonService {

    public PersonRequestType processPersons(Map<String, Object> valueMap) {


        return (PersonRequestType) valueMap.get("Request");
    }
}
