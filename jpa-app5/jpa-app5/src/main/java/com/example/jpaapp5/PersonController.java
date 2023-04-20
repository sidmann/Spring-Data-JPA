package com.example.jpaapp5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping("save")
	public Person save(@RequestBody Person person)
	{
		return personRepository.save(person);
	}
	
	@RequestMapping("readAll/{firstName}")
	public Iterable<Person> readAll(@PathVariable String firstName)
	{
		return personRepository.findByFirstName(firstName);
	}
}
