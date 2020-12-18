package com.org.rest.model.person;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class WorkExperience {
	public String title;
	public String company;
	@JsonFormat(pattern="MMM/yyyy")
	public Date from;
	@JsonFormat(pattern="MMM/yyyy")
	public Date to;
	public Boolean current;
	public String description;
}
