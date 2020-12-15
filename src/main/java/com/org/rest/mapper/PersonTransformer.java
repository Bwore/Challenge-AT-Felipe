package com.org.rest.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.rest.dto.PersonDto;
import com.org.rest.model.Person;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;

@Component
public class PersonTransformer {

	private MapperFacade mapperFacade;
	
	@Autowired
	public void transform(MapperFactory factory) {
		this.mapperFacade = factory.getMapperFacade();
		factory.classMap(Person.class, PersonDto.class).mapNulls(false).mapNullsInReverse(false).register();
		factory.classMap(PersonDto.class, Person.class).mapNulls(false).mapNullsInReverse(false).register();
	}
	
	public Person transformer(PersonDto personDto) {
		return mapperFacade.map(personDto, Person.class);
	}
	
	public PersonDto transformer(Person person) {
		return mapperFacade.map(person, PersonDto.class);
	}
}
