package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M3 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student obj1 = context.getBean("s1", Student.class);
		System.out.println("object is ready");
		System.out.println(obj1.getFirstName());
		System.out.println(obj1.getLastName());
		context.registerShutdownHook();
		System.out.println("done");
	}
}
