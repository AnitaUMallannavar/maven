package com.xworkz.horror.configuration;

import org.springframework.context.annotation.Bean;

public class FloatConfigCls {

	@Bean
	public Float weight() {
		System.out.println("registering weight in FloatConfigCls");
		return 45.654F;
	}

	@Bean
	public Float weight2() {
		System.out.println("registering weight2 in FloatConfigCls");
		return 55.654F;
	}

	@Bean
	public Float weight3() {
		System.out.println("registering weight3 in FloatConfigCls");
		return 45.654F;
	}

	@Bean
	public Float areaInKm() {
		System.out.println("registering areaInKm in FloatConfigCls");
		return 45.654F;
	}

	@Bean
	public Float petrolCostPerLiter() {
		System.out.println("registering petrolCostPerLiter in FloatConfigCls");
		return 99.654F;
	}

	@Bean
	public Float desailCostPerLiter() {
		System.out.println("registering desailCostPerLiter in FloatConfigCls");
		return 101.654F;
	}

	@Bean
	public Float grapesCost() {
		System.out.println("registering grapesCost in FloatConfigCls");
		return 99.654F;
	}

	@Bean
	public Float honeyCost() {
		System.out.println("registering honeyCost in FloatConfigCls");
		return 301.654F;
	}

	@Bean
	public Float colorCode() {
		System.out.println("registering colorCost in FloatConfigCls");
		return 2121.654F;
	}
}
