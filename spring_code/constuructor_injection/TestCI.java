package com.app.springcore.constuructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/app/springcore/constuructor_injection/con_config.xml");

		Person p = (Person) context.getBean("person");
		System.out.println(p.toString());
	}
}
