package com.org.rest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;

@Document(collection = "Person")
@Data
public class Person {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String firstname;
    private String lastname;
    private String job;
    private String city;
    private String country;
    private String email;
    private String phoneNumber;
}