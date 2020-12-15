package com.org.rest.service;

import com.org.rest.dto.PersonDto;
import com.org.rest.model.PersonId;

public interface ApiService {
	PersonDto getPersonById(String id);
	PersonId postPerson(PersonDto personDto);
	//String deletePerson(String id);
}