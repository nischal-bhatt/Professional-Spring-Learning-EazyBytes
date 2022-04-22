package com.example.beans;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component(value = "daaruwichpyaarz")

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
