package com.example.jpaapp5;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
	
	public Iterable<Person> findByFirstName(String firstName);

}
