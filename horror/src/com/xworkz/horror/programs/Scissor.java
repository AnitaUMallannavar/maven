package com.xworkz.horror.programs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("scissor")
public class Scissor {
	private String type;
	private double weight;
	private String colour;

	public Scissor(@Value("Bandege") String type, @Value("3.2") double weight) {
		super();
		this.type = type;
		this.weight = weight;
	}

	@Value("Blue")
	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Scissor [type=" + type + ", weight=" + weight + ", colour=" + colour + "]";
	}

}
