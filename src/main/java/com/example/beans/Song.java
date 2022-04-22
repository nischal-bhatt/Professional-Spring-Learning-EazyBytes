package com.example.beans;

public class Song {
	private String name = "hello";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printHelloWorld()
	{
		System.out.println("printing song name " + name);
	}
}
