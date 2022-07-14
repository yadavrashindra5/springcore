package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.*;

@Component("object1")
@Scope("prototype")
public class Student {
	
	@Value("Rashindra Yadav")
	private String studentName;
	
	@Value("Janakpur")
	private String city;
	
	@Value("#{list}")
	private List<String>address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, String city, List<String> address) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}
	
	

}
