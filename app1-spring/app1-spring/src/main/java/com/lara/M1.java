package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	//	Person obj = context.getBean(Person.class);
	Person obj = (Person) context.getBean("p1");
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
	}
}
