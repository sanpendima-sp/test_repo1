package org.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutePayment {
	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("config-2.xml");
		PaymentService payservice = (PaymentService) cxt.getBean("ps");
		payservice.makePayment("5000");
	}
}
