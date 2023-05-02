package com.xworkz.horror.onlyProgram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ShrutiConfigCls {

	@Override
	public String toString() {
		return "ShrutiConfigCls [name=" + name + ", age=" + age + ", location=" + location + ", phoneNo=" + phoneNo
				+ ", weight=" + weight + ", height=" + height + ", education=" + education + ", combination="
				+ combination + ", working=" + working + ", alive=" + alive + ", married=" + married + ", isSingle="
				+ isSingle + ", isLovesNature=" + isLovesNature + ", statrtName=" + startingLetter + "]";
	}

	@Value("Shruti")
	private String name;
	private int age;
	@Value("Bagalkot")
	private String location;
	private long phoneNo;
	private double weight;
	private double height;

	private String education;
	@Value("PCM")
	private String combination;
	private boolean working;
	private boolean alive;
	private boolean married;
	private boolean isSingle;
	private boolean isLovesNature;
	private char startingLetter;

	public ShrutiConfigCls(@Value("23") int age, @Value("75487346721") long phoneNo, @Value("40.3") double weight,
			@Value("4.8") double height, @Value("false") boolean working, @Value("true") boolean alive,
			@Value("false") boolean married, @Value("true") boolean isSingle, @Value("true") boolean isLovesNature,
			@Value("S") char statrtName) {
		super();
		System.out.println("Registering Akshata's information in AkshataConfigCla");
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

	
	public String education() {
		System.out.println("education registration");
		return "[BE]";
	}

}
