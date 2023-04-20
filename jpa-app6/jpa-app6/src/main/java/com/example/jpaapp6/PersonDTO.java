package com.example.jpaapp6;

public class PersonDTO {
	
	private String firstName;
	private String email;
	private Integer age;
	
	public PersonDTO(String firstName, String email, Integer age) {
		this.firstName = firstName;
		this.email = email;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getEmail() {
		return email;
	}

	public Integer getAge() {
		return age;
	}	
}
