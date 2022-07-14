package com.springcore.auto.wire.annotation;

import java.util.*;
public class Phone {
	private List<String>list;
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(List<String> list) {
		super();
		this.list = list;
		
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
		System.out.println("phone constructor");
	}

	@Override
	public String toString() {
		return "Phone [list=" + list + "]";
	}
	
	
	
}
