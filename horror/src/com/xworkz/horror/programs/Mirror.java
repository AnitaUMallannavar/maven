package com.xworkz.horror.programs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mirror {
	private double height;
	private String shape;
	@Value("1.3")
	private double weight;

	public Mirror(@Value("2.3") double height, @Value("round") String shape) {
		super();
		this.height = height;
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "Mirror [height=" + height + ", shape=" + shape + ", weight=" + weight + "]";
	}

}
