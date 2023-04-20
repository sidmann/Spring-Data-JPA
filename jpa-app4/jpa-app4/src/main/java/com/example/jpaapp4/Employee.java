package com.example.jpaapp4;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private String empId;
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
/*
{
	"empId": "e101",
	"firstName": "Ramu",
	"lastName": "R",
	"age": 22,
	"address": "BTM"
}
{
	"empId": "e102",
	"firstName": "Mohan",
	"lastName": "M",
	"age": 24,
	"address": "BTM1"
}
{
	"empId": "e103",
	"firstName": "Swetha",
	"lastName": "S",
	"age": 22,
	"address": "BTM1"
}
{
	"empId": "e104",
	"firstName": "Ravi",
	"lastName": "RR",
	"age": 29,
	"address": "JP Nagar"
}
*/