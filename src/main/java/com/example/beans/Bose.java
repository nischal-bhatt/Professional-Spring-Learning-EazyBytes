package com.example.beans;

import org.springframework.stereotype.Component;

@Component(value="bose")
public class Bose implements Tyre{

	@Override
	public void sayName() {
		System.out.println("this is bose");
	}

}
