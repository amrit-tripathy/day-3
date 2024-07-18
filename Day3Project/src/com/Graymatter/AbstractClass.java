package com.Graymatter;

public abstract class AbstractClass { //if any method is abstract make class as abstract
	
	private String name;
	
	public String printName(String name) {
		this.name = name;
		return this.name;
		
	}
	public abstract void sayHello();//no definition
	
	

}
