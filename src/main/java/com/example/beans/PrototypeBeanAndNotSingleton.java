package com.example.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("ori")
@Lazy 
// see in console when bean is actually being created
public class PrototypeBeanAndNotSingleton {

	public PrototypeBeanAndNotSingleton() {
		
		System.out.println("***bean being created**");
	}

	
}
