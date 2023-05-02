package com.xworkz.horror.programs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("saloon")
public class Saloon {
	private String name;
	private String ownerNamr;
	private String type;
	private String location;
	private int noOfBarbars;

	public Saloon(@Value("Priya ") String name, @Value("Priyanka") String ownerNamr, @Value("kids") String type,
			@Value("BTM") String location, @Value("2") int noOfBarbars) {
		this.name = name;
		this.ownerNamr = ownerNamr;
		this.type = type;
		this.noOfBarbars = noOfBarbars;
		this.location = location;

		//System.out.println(" Creating String,String,String,String,int args in Saloon..");
	}

	@Override
	public String toString() {
		return "Saloon [name=" + name + ", ownerNamr=" + ownerNamr + ", type=" + type + ", location=" + location
				+ ", noOfBarbars=" + noOfBarbars + "]";
	}
}
