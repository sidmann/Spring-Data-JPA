package com.example.manytomany.abc;

import org.springframework.stereotype.Component;

@Component("bType")
public class B extends A {

	public String toString()
	{
		return "I am from B";
	}
}
