package com.example.jpaapp5;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
	
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
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
}

/*
	{
		"id": 101,
		"firstName":"Sidhant",
		"lastName":"Mann",
		"age": 32
	}
	
	{
		"id": 102,
		"firstName":"Ramu",
		"lastName":"test",
		"age": 22
	}
	
	{
		"id": 103,
		"firstName":"Ramu",
		"lastName":"abc",
		"age": 24
	}
	
*/