package com.ncart.pc.service.controller;

import com.ncart.pc.service.constants.NCartConstants;
import com.ncart.pc.service.models.PersonRequestType;
import com.ncart.pc.service.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/test")
    ResponseEntity<String> test(
            @RequestHeader String interactionId,
            @RequestHeader String messageId,
            @RequestHeader String userId,
            @RequestHeader boolean mock
            //@RequestBody PayloadType payloadType
    ) {
        Map<String, Object> valueMap = new HashMap<>();
        valueMap.put("interactionId", interactionId);
        valueMap.put("messageId", messageId);
        valueMap.put("userId", userId);
        valueMap.put("mock", mock);
        //valueMap.put("Request", payloadType);

        return ResponseEntity.ok().body("Mahesh");
    }

    @PostMapping("/persons")
    ResponseEntity<PersonRequestType> processPersons(
            @RequestHeader(name = NCartConstants.Headers.INTERACTION_ID, required = true) String interactionId,
            @RequestHeader(name = NCartConstants.Headers.MESSAGE_ID, required = true) String messageId,
            @RequestHeader(name = NCartConstants.Headers.USER_ID, required = true) String userId,
            @RequestHeader(name = NCartConstants.Headers.MOCK, required = false) boolean mock,
            @RequestBody PersonRequestType payloadType
    ) {
        Map<String, Object> valueMap = new HashMap<>();
        valueMap.put(NCartConstants.Headers.INTERACTION_ID, interactionId);
        valueMap.put(NCartConstants.Headers.MESSAGE_ID, messageId);
        valueMap.put(NCartConstants.Headers.USER_ID, userId);
        valueMap.put(NCartConstants.Headers.MOCK, mock);
        valueMap.put(NCartConstants.ProcessKeys.REQUEST_BODY, payloadType);

        return ResponseEntity.ok().body(personService.processPersons(valueMap));
    }
}
