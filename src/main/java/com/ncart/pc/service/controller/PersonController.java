package com.ncart.pc.service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PersonController {

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
}
