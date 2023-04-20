package com.lara;

public class Student {

	private String firstName;
	private String lastName;

	public Student() {
		System.out.println("Student()");
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

	public void test1() {
		System.out.println("I am from test1");
	}

	public void test2() {
		System.out.println("I am from test2");
	}
}
