package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.springcore.stereotype.Student;

public class Test {
	public static void main(String args[]) throws Exception
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Demo demo1=context.getBean("demo",Demo.class);
		System.out.println(demo1);
		
	}
}
