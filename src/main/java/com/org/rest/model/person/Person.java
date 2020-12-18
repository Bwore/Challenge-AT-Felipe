package com.org.rest.model.person;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;

import java.util.ArrayList;

@Document(collection = "Person")
@Data
public class Person {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String firstName;
    private String lastName;
    private String job;
    private String city;
    private String country;
    private String email;
    private String phoneNumber;
    private ArrayList<Skills> skills;
    private ArrayList<Languages> languages;
    private ArrayList<WorkExperience> workexperience;
    private ArrayList<Education> education;
    private ArrayList<Challenges> challenges;
    private ArrayList<SocialMedia> socialMedia;
    private ArrayList<Config> config;
}