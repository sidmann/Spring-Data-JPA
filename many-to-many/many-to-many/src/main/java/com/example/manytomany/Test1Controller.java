package com.example.manytomany;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("t1")
public class Test1Controller {
	
	@GetMapping
	public String test1()
	{
		System.out.println("from test1");
		return "from test1";
	}
	
	@GetMapping("t2")
	public String test2()
	{
		System.out.println("from test2");
		return "from test2";
	}
	
	@PostMapping
	public String test3()
	{
		System.out.println("from test3");
		return "from test3";
	}
	
	@PostMapping("t4")
	public String test4()
	{
		System.out.println("from test4");
		return "from test4";
	}
	
}

/*
	200 ==> OK (success)
	404 ==> resource not available
	405 ==> method not supported
	401 ==> input is not proper
	500 ==> server-side exception
*/