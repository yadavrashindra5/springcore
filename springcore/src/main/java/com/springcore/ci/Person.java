package com.springcore.ci;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int personId, Certi certi) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi.name +"{"+certi.list+"}"+ "]";
	}

	

	
}
