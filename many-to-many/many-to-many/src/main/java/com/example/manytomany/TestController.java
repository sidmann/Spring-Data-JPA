package com.example.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manytomany.abc.A;

@RestController
public class TestController {
	
	@Autowired
	Test test;
	
	@Autowired
	Abc abc;
	
	@Autowired
	@Qualifier("bType")
	A obj;
	
	@Autowired
	Environment environment;
	
	@RequestMapping("test")
	public String test()
	{
		System.out.println("test obj: " + test);
		System.out.println("abc obj: " + abc);
		System.out.println("A type obj: " + obj);
		String s1 = environment.getProperty("server.port");
		return "success: " + s1;
	}
}
