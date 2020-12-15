package com.org.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.rest.dto.PersonDto;
import com.org.rest.mapper.PersonTransformer;
import com.org.rest.model.Person;
import com.org.rest.model.PersonId;
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
	public PersonDto getPersonById(String id) {
		PersonDto person = new PersonDto();
		person = apiRepository.getPersonById(id);
		return person;
	}
	@Override
	public PersonId postPerson(PersonDto personDto) {
		log.info("Resquest = ", personDto);
		PersonId personId = new PersonId();
		Person person = personTransformer.transformer(personDto);
		log.info("ServiceApplicationimpl.createUser - users transformed: {}", person);
		String personToDb = apiRepository.save(person).getId();
		log.info("ServiceApplicationimpl.createUser- User saved  successfully with id: {}", person.getId());
		personId.setId(personToDb);
		log.info("ServiceApplicationimpl.createUser- User created successfully on mongoDB: {}", personId);
		return personId;
	}
	/*@Override
	public String deletePerson(String id) {
		apiRepository.deletePerson(id);
		return id + " Was DELETED";
	}*/
}