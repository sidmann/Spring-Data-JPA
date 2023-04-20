package com.example.manytomany.abc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cType")
@Primary
public class C extends A {

	public String toString()
	{
		return "I am from C";
	}
}
