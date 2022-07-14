package com.springcore.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj1")
@Scope("prototype")
public class ClassA {
	
	@Value("Rashindra")
	private String name;
	
	@Autowired
	private ClassB b;
	
	
	public ClassA() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ClassA(String name, ClassB b) {
		super();
		this.name = name;
		this.b = b;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ClassB getB() {
		return b;
	}
	
	
	public void setB(ClassB b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "ClassA [name=" + name + ", b=" + b.getArraylist() + "]";
	}
	
	
	
}
