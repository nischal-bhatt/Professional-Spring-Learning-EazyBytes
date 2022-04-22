package com.example.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component(value = "daaruwichpyaarz")
//@Lazy
//it is recommended to go for eager
//means it is only created when it is needed.. not during startup
//this bean by default is a singleton, 
//so it is better to make it immutable,
//to make it safe from race conditions
public class Beer {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//@PostConstruct
	//public void setNama()
	//{
	//	this.setName("guiness");
	//}
}
