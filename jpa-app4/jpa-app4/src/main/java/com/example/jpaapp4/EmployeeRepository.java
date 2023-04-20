package com.example.jpaapp4;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String>{

}

/*
	C ==> save()
	R ==> finder methods
	U ==> save()
	D ==> delete methods
*/