package com.example.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Component
@Service
public class Movie {
	private String name;

	private final Tyre tyre;
	
	public Movie(@Qualifier("bose")Tyre tyre) {
		
		this.tyre = tyre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printMovie()
	{
		System.out.println("movie name is " + this.name+ " speaker is " );
		this.tyre.sayName();
	}
	
	@PostConstruct
	public void initialize()
	{
		System.out.println("object created.. now ...setting name");
		this.setName("jim,,,,***");
	}
	
	@PreDestroy()
	public void destroyingzzzzz()
	{
		System.out.println("destroying " + this + " bean");
	    
	}
		
	
}
