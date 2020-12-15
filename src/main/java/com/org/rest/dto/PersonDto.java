package com.org.rest.dto;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
	@Id
	private String id;
    private String firstname;
    private String lastname;
    private String job;
    private String city;
    private String country;
    private String email;
    private String phoneNumber;
}