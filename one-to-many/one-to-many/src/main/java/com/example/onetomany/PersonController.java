package com.example.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping("person/save")
	public Person save(@RequestBody Person person)
	{
		return personService.save(person);
	}
	
	@RequestMapping("person/load")
	public Iterable<Person> load()
	{
		return personService.load();
	}
	
}
