package com.app.springcore.constuructor_injection;

public class Certificate {
	String certi_name;

	public Certificate(String certi_name) {
		super();
		this.certi_name = certi_name;
	}

	@Override
	public String toString() {
		return "Certificate [certi_name=" + certi_name + "]";
	}
}
