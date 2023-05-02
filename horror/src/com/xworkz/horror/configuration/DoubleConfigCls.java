package com.xworkz.horror.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DoubleConfigCls {

	@Bean
	public Double weight() {
		System.out.println("registering weight in DoubleConfigCls");
		return 38.4;
	}

	@Bean
	public Double height() {
		System.out.println("registering height in DoubleConfigCls");
		return 5.6;
	}

	@Bean
	public Double areaInCM() {
		System.out.println("registering height in DoubleConfigCls");
		return 34.34;
	}

	@Bean
	public Double cost() {
		System.out.println("registering cost in DoubleConfigCls");
		return 45.4576;
	}

	@Bean
	public Double salary() {
		System.out.println("registering salary in DoubleConfigCls");
		return 44086.54;
	}

	@Bean
	public Double phoneCode() {
		System.out.println("registering phoneCode in DoubleConfigCls");
		return 6542.34;
	}

	@Bean
	public Double gst() {
		System.out.println("registering gst in DoubleConfigCls");
		return 7697.65;
	}

	@Bean
	public Double storageInMB() {
		System.out.println("registering storage in DoubleConfigCls");
		return 23.32;
	}

	@Bean
	public Double distanInKM() {
		System.out.println("registering  distanInKM DoubleConfigCls");
		return 560.5;
	}
}
