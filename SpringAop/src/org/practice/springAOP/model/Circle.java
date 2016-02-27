package org.practice.springAOP.model;

import org.practice.springAOP.aspect.Loggable;

public class Circle {
	
	private String name;
	
	@Loggable
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
