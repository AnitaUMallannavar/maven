package com.xworkz.horror.programs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Barber {
	private String name;
	private String exp;
	private double salary;
	private int age;
	private long contactNo;
	@Value("Female")
	private String gender;

	public Barber(@Value("Abhilasha") String name, @Value("2 years expirience") String exp,
			@Value("67677.67") double salary, @Value("26") int age, @Value("8193980898") long contactNo) {
		super();
		this.name = name;
		this.exp = exp;
		this.salary = salary;
		this.age = age;
		this.contactNo = contactNo;

	}

	@Override
	public String toString() {
		return "Barber [name=" + name + ", exp=" + exp + ", salary=" + salary + ", age=" + age + ", contactNo="
				+ contactNo + ", gender=" + gender + "]";
	}
}
