package com.example.beans;

import org.springframework.stereotype.Component;

@Component(value="sony")
public class Sony implements Tyre{

	@Override
	public void sayName() {
		System.out.println("sony");
	}

}
