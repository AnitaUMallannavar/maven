package com.xworkz.horror.programs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HairDryer {
	private String brand;
	private String type;
	private String colour;
	@Value("2.3")
	private double weirht;

	public HairDryer(@Value("beurer") String brand, @Value("Curli") String type, @Value("Pink") String colour) {
		super();
		this.brand = brand;
		this.type = type;
		this.colour = colour;

	}

	@Override
	public String toString() {
		return "HairDryer [brand=" + brand + ", type=" + type + ", colour=" + colour + ", weirht=" + weirht + "]";
	}

}
