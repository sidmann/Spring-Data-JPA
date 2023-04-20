package com.example.jpaapp6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApp6Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaApp6Application.class, args);
		System.out.println("app6 started...");
	}
	
	@Autowired
	private PersonRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		Person p1 = new Person();
		p1.setFirstName("Sidhant");
		p1.setLastName("Mann");
		p1.setAge(31);
		p1.setId(1);
		p1.setEmail("sm@gmail");
		repository.save(p1);
	}
}
