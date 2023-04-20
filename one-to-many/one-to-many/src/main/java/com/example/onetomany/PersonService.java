package com.example.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public Person save(Person person)
	{
		for (MobileNumber mobileNumber : person.getMobileNumbers())
		{
			mobileNumber.setPerson(person);
		}
		return personRepository.save(person);
	}
	
	public Iterable<Person> load()
	{
		return personRepository.findAll();
	}
}
