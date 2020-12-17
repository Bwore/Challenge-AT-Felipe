package com.org.rest.controller;

import com.org.rest.model.person.Person;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;

import com.org.rest.dto.PersonDto;
import com.org.rest.model.person.PersonId;
import com.org.rest.service.ApiService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/cv-api/person")
public class ApiController {
	@Autowired
    private ApiService apiService;

    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Person getPersonById(@PathVariable String id){
        return apiService.getPersonById(id);
    }
    
    @PostMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public PersonId postPerson(@RequestBody Person person) {
    	log.info("RequestBody: ", person);
    	return apiService.postPerson(person);
    }

    @PutMapping(value = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Person putPerson(@PathVariable String id, @RequestBody Person person){
        return apiService.putPerson(id,person);
    }

    @DeleteMapping(value = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public String deletePersonById(@PathVariable String id){
        return apiService.deletePersonById(id);
    }
}