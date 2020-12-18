package com.org.rest.model.person;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Education {
	public String name;
	public String career;
	@JsonFormat(pattern="dd/MM/yyyy")
	public Date from;
	@JsonFormat(pattern="dd/MM/yyyy")
	public Date to;
	public String degree; //Enum?
}