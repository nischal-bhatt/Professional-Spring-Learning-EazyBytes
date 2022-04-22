package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dinnermeal")
public class DinnerMeal {

	
	
	private final Beer beer;
	
	@Autowired
	//here got autowired so 
	//in Beer class dun autowire --> otherwise circular dependency
	public DinnerMeal(@Qualifier(value="daaruwichpyaarz")Beer beer) {
		
		this.beer = beer;
	}

	public void displayBeer()
	{
		System.out.println("beer that goes with my dinner is " + this.beer.getName());
	}
	
}
