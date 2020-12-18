package com.org.rest.model.person;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Challenges {
	public String name;
    @JsonFormat(pattern="dd/MM/yyyy")
	public Date date;
	public String description;
	public String url;
}