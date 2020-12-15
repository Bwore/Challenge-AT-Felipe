package com.org.rest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.org.rest.dto.PersonDto;
import com.org.rest.model.Person;

@Repository
public interface ApiRepository extends MongoRepository<Person, String>{
	PersonDto getPersonById(String id);
	//String deletePerson(String id);
}