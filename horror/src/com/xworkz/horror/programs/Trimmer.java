package com.xworkz.horror.programs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trimmer {
	private String brand;
	private String colour;
	private double peice;
	@Value("1.3")
	private double height;

	public Trimmer(@Value("Philips") String brand, @Value("Black") String colour, @Value("3480") double peice) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.peice = peice;

	}

	@Override
	public String toString() {
		return "Trimmer [brand=" + brand + ", colour=" + colour + ", peice=" + peice + ", height=" + height + "]";
	}

}
