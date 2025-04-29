package com.ncart.pc.service.repository;

import com.ncart.pc.service.dtos.PersonCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonsRepo extends MongoRepository<PersonCollection, String> {
}
