package com.springcore.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/practice/config.xml");
		ClassA a=context.getBean("obj1",ClassA.class);
		System.out.println(a);
		ClassA b=context.getBean("obj1",ClassA.class);
		System.out.println(a.hashCode()+" "+b.hashCode());
		
	}

}
