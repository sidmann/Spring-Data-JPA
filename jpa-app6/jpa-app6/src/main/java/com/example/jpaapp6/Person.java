package com.example.jpaapp6;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
	
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	
	@Column(unique = true)
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	"id":1,
	"firstName":"Sidhant",
	"lastName":"Mann",
	"age":31,
	"email":"sm@gmail"
}

{
	"id":2,
	"firstName":"Ramu",
	"lastName":"Patel",
	"age":24,
	"email":"rp@gmail"
}

{
	"id":3,
	"firstName":"Vishal",
	"lastName":"Pakar",
	"age":25,
	"email":"kp@gmail"
}

{
	"id":4,
	"firstName":"Raju",
	"lastName":"Sharma",
	"age":26,
	"email":"pp@gmail"
}

{
  "id": 5,
  "firstName": "Kishan",
  "lastName": "Pr",
  "age": 29,
  "email": "kish@gmail"
}

{
  "id": 6,
  "firstName": "Ram",
  "lastName": "Jaiswal",
  "age": 54,
  "email": "ram@gmail"
}

{
  "id": 7,
  "firstName": "Shyam",
  "lastName": "Kushwaha",
  "age": 44,
  "email": "shyam@gmail"
}
*/


















