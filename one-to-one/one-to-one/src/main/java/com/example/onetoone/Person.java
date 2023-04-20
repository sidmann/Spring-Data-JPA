package com.example.onetoone;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}

 /*
  	{
  		"firstName": "abc",
  		"lastName": "xyz"
  	}
  	
	{
		"firstName": "abc",
		"lastName": "xyz",
		"address": {
			"houseNo": "123/M",
			"streetName": "BTM"
		}
	}
  		
	{
		"firstName": "abc",
		"lastName": "xyz",
		"address": {
			"houseNo": "123/M",
			"streetName": "BTM",
			"person": {
				"id": 2
			}
		}
	}
  		
 */