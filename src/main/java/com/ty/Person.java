package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value(value = "24")
	int age;
	private String name;
	double height;
	
	public String getName() {
		return name;
	}
	@Value(value = "geet")
	public void setName(String name) {
		this.name = name;
	}
	public Person( @Value(value = "5.4")double height) {
		super();
		
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", height=" + height + "]";
	}
	
	
}
