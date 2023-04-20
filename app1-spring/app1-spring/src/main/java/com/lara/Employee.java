package com.lara;

public class Employee {
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		System.out.println("I am from Employee Constructor");
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}
