package com.org.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.rest.dto.PersonDto;
import com.org.rest.mapper.PersonTransformer;
import com.org.rest.model.person.Person;
import com.org.rest.model.person.PersonId;
import com.org.rest.repository.ApiRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ApiServiceImpl implements ApiService {

	@Autowired
	private ApiRepository apiRepository;
	
	@Autowired
	private PersonTransformer personTransformer;
	
	@Override
	public Person getPersonById(String id) {
		Person person = new Person();
		person = apiRepository.getPersonById(id);
		return person;
	}

	@Override
	public PersonId postPerson(Person person){
		PersonId personId = new PersonId();
		apiRepository.save(person);
		personId.setId(person.getId());
		return personId;
	}

	@Override
	public Person putPerson(String id, Person person){
		person.setId(id);
		apiRepository.save(person);
		return person;
	}

	@Override
	public String deletePersonById(String id) {
		apiRepository.deletePersonById(id);
		return id;
	}
}