package com.org.rest.service;

import com.org.rest.model.person.Person;
import com.org.rest.model.person.PersonId;

public interface ApiService {
	Person getPersonById(String id);
	PersonId postPerson(Person person);
	Person putPerson(String id, Person person);
	String deletePersonById(String id);
}