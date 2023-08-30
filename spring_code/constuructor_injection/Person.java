package com.app.springcore.constuructor_injection;

public class Person {
	private int stuId;
	private String stuName;
	private Certificate certi;

	public Person(int stuId, String stuName, Certificate certi) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [stuId=" + stuId + ", stuName=" + stuName + ", Certificate is: " + certi.certi_name + "]";
	}
}
