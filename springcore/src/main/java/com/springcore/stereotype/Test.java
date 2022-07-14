package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Student student=context.getBean("object1",Student.class);
		System.out.println(student.hashCode());
		Student s=context.getBean("object1",Student.class);
		System.out.println(s.hashCode());
	
		Teacher t=context.getBean("teacher",Teacher.class);
		Teacher t1=context.getBean("teacher",Teacher.class);
		
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
	}

}
