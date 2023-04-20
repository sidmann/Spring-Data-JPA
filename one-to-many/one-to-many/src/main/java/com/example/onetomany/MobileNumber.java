package com.example.onetomany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class MobileNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Long mobileNumber;
	private String serviceProvider;
	@ManyToOne
	@JsonIgnore
	private Person person;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}

/*
	{
		"mobileNumber": 9898989898,
		"serviceProvider": "Airtel",
		"person": {
			"id": 1
		}
	}
	
	{
		"mobileNumber": 9898989898,
		"serviceProvider": "Jio",
		"person": {
			"id": 1
		}
	}
	
	{
		"mobileNumber": 7878787878,
		"serviceProvider": "BSNL",
		"person": {
			"id": 2
		}
	}
	
	{
		"mobileNumber": 8585858585,
		"serviceProvider": "Vodafone",
		"person": {
			"id": 3
		}
	}
	
*/
