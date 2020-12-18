package com.org.rest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.org.rest.model.person.Person;

@Repository
public interface ApiRepository extends MongoRepository<Person, String>{
	Person getPersonById(String id);
	String deletePersonById(String id);
}