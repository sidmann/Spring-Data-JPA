package com.example.jpaapp3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping("emp/save")
	public Employee save(@RequestBody Employee employee)
	{
		System.out.println("emp save");
		return employeeRepository.save(employee);
	}
	
	@RequestMapping("emp/load")
	public Iterable<Employee> load()
	{
		System.out.println("emp load");
		return employeeRepository.findAll();
	}
	
	@RequestMapping("emp/load/{id}")
	public Employee load(@PathVariable Integer id)
	{
		System.out.println("emp load");
		return employeeRepository.findById(id).get();
	}
	
}
