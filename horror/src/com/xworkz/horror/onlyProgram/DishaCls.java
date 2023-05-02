package com.xworkz.horror.onlyProgram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DishaCls {

	@Override
	public String toString() {
		return "DishaCls [name=" + name + ", age=" + age + ", location=" + location + ", phoneNo=" + phoneNo
				+ ", weight=" + weight + ", height=" + height + ", education=" + education + ", combination="
				+ combination + ", working=" + working + ", alive=" + alive + ", married=" + married + ", isSingle="
				+ isSingle + ", isLovesNature=" + isLovesNature + ", statrtName=" + startingLetter + "]";
	}

	@Value("Disha")
	private String name;
	private int age;
	@Value("Belagavi")
	private String location;
	private long phoneNo;
	private double weight;
	private double height;
	@Value("BCA")
	private String education;
	@Value("Optional English")
	private String combination;
	private boolean working;
	private boolean alive;
	private boolean married;
	private boolean isSingle;
	private boolean isLovesNature;
	private char startingLetter;

	public DishaCls(@Value("26") int age, @Value("9576473467") long phoneNo, @Value("40.3") double weight,
			@Value("4.9") double height, @Value("false") boolean working, @Value("true") boolean alive,
			@Value("true") boolean married, @Value("false") boolean isSingle, @Value("true") boolean isLovesNature,
			@Value("D") char statrtName) {
		super();
		System.out.println("Registering Disha's information in AkshataConfigCla");
		this.age = age;
		this.phoneNo = phoneNo;
		this.weight = weight;
		this.height = height;
		this.working = working;
		this.alive = alive;
		this.married = married;
		this.isSingle = isSingle;
		this.isLovesNature = isLovesNature;
		this.startingLetter = statrtName;
	}

}
