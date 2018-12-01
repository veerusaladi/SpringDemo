package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Object ob=ac.getBean("emp");
		Employee e=(Employee)ob;
		e.fuck();
		System.out.println(e);
				

	}

}
