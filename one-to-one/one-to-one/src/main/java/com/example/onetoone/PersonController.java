package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping("person/save")
	public Person save(@RequestBody Person person)
	{
		person.getAddress().setPerson(person);
		return personRepository.save(person);
	}
	
	@RequestMapping("person/read")
	public Iterable<Person> load()
	{
		return personRepository.findAll();
	}
}
