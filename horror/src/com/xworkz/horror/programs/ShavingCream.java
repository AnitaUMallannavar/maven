package com.xworkz.horror.programs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShavingCream {
	private String brand;
	private int price;
	@Value("good")
	private String quantity;

	public ShavingCream(@Value("Gillette") String brand, @Value("78") int price) {
		super();
		this.brand = brand;
		this.price = price;

	}

	@Override
	public String toString() {
		return "ShavingCream [brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
