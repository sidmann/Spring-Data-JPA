package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M4 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer obj1 = context.getBean("c1", Customer.class);
		System.out.println(obj1.getFirstName());
		System.out.println(obj1.getLastName());
		Address add = obj1.getAddress();
		System.out.println(add.getHouseNo());
		System.out.println(add.getStreetName());
	}
}
// autowire = "byType" is not recommended as there may be more than one bean which will cause ambiguity runtime exception.
// autowire = "byName" is highly recommended