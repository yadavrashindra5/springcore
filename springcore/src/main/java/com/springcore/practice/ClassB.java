package com.springcore.practice;

import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClassB {
	
	@Value("#{list}")
	private ArrayList<String>arraylist;

	public ClassB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassB(ArrayList<String> arraylist) {
		super();
		this.arraylist = arraylist;
	}

	public ArrayList<String> getArraylist() {
		return arraylist;
	}

	public void setArraylist(ArrayList<String> arraylist) {
		this.arraylist = arraylist;
	}
	
	
}
