package com.springcore.auto.wire;

public class Emp {
	
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("constructor");
	}




	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setter is called");
	}




	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	


	
	
}
