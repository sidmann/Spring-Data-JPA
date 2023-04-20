package com.example.onetomany;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	private Set<MobileNumber> mobileNumbers = new HashSet<>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Set<MobileNumber> getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(Set<MobileNumber> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
}

/*
	{
		"firstName": "Sidhant",
		"lastName": "Mann",
		"age": 31,
		"mobileNumbers": [
		{
			"mobileNumber": 9898989898, 8888999977
			"serviceProvider": "Airtel"
		}
		]
	}
	
	{
		"firstName": "Satish",
		"lastName": "Kumar",
		"age": 22,
		"mobileNumbers": [
		{
			"mobileNumber": 8787878787,
			"serviceProvider": "Jio"
		}
		]
	}
	
	{
		"firstName": "Vishal",
		"lastName": "Patidar",
		"age": 25,
		"mobileNumbers": [
		{
			"mobileNumber": 7878787878,
			"serviceProvider": "Vodafone"
		}
		]
	}
	
	{
		"firstName": "Aakash",
		"lastName": "Gupta",
		"age": 22,
		"mobileNumbers": [
		{
			"mobileNumber": 5958575456,
			"serviceProvider": "Idea"
		}
		]
	}
	
*/
