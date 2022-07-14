package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	private String street;
	private String city;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
		System.out.println("constructor");
		
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
		System.out.println("street setter");
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
		System.out.println("city setter");
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
	
	
}
