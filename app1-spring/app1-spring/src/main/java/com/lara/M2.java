package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee) context.getBean("e1");
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
	}
}
