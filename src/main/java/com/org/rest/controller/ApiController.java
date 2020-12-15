package com.org.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.org.rest.dto.PersonDto;
import com.org.rest.model.PersonId;
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
    public PersonDto getPersonById(@PathVariable String id){
        log.info("GET user with ID: ", id);
        return apiService.getPersonById(id);
    }
    
    @PostMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public PersonId postPerson(@RequestBody PersonDto personDto) {
    	log.info("RequestBody: ", personDto);
    	return apiService.postPerson(personDto);
    }
    /*@DeleteMapping(value = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public String deletePerson(@PathVariable String id) {
    	return apiService.deletePerson(id);
    }*/
}