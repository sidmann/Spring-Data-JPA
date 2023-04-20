package com.example.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("student/save")
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	@RequestMapping("student/load")
	public Iterable<Student> load() {
		return studentService.load();
	}
}
