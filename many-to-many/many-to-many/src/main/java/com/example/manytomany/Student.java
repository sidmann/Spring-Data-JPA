package com.example.manytomany;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer stdId;
	private String firstName;
	private String lastName;
	@ManyToMany
	private Set<Skill> skills = new HashSet<>();
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
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
	public Set<Skill> getSkills() {
		return skills;
	}
	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}
}
/*
	{
		"firstName": "Ramu",
		"lastName": "test",
		"skills": [
			{"id": 1},
			{"id": 2},
			{"id": 3}
		]
	}
	
	{
		"firstName": "Vijay",
		"lastName": "test",
		"skills": [
			{"id": 1},
			{"id": 3}
		]
	}
	
*/

