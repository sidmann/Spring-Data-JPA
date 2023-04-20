package com.example.jpaapp4;

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
		return employeeRepository.save(employee);
	}
	
	@RequestMapping("emp/load")
	public Iterable<Employee> load()
	{
		return employeeRepository.findAll();
	}
	
	@RequestMapping("emp/load/{id}")
	public Employee load(@PathVariable String id)
	{
		return employeeRepository.findById(id).get();
	}
	
	@RequestMapping("emp/delete/{id}")
	public String delete(@PathVariable String id)
	{
		employeeRepository.deleteById(id);
		return id;
	}
	
	@RequestMapping("emp/delete")
	public String delete()
	{
		employeeRepository.deleteAll();
		return "all records deleted";
	}
	
}
