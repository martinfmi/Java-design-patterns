package com.toshev.martin.patterns.structural.flyweight;

public class Manufacturer {
	
	private String name;

	public Manufacturer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
