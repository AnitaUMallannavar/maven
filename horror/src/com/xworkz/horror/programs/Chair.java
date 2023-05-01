package com.xworkz.horror.programs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chair {
	@Value("Black")
	private String colour;
	@Value("round")
	private String shape;
	@Value("Steal&Plastick")
	private String type;
	@Override
	public String toString() {
		return "Chair [colour=" + colour + ", shape=" + shape + ", type=" + type + "]";
	}

}
