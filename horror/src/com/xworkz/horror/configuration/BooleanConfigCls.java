package com.xworkz.horror.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BooleanConfigCls {

	@Bean
	public Boolean isKrishnaGood() {
		System.out.println("Running isKrishnaGood in BooleanConfigCls");
		return true;
	}

	@Bean
	public Boolean isHanumanGood() {
		System.out.println("Running isHanumanGood in BooleanConfigCls");
		return true;
	}

	@Bean
	public Boolean isMahalaxmiGood() {
		System.out.println("Running isMahalaxmiGood in BooleanConfigCls");
		return true;
	}

	@Bean
	public Boolean isGaneshGood() {
		System.out.println("Running isGaneshGood in BooleanConfigCls");
		return true;
	}

	@Bean
	public Boolean isKannikaParameshwariGood() {
		System.out.println("Running isKannikaParameshwariGood in BooleanConfigCls");
		return true;
	}

	@Bean
	public Boolean isSaibabaGood() {
		System.out.println("Running isSaibabaGood in BooleanConfigCls");
		return true;
	}

	@Bean
	public Boolean isGandhigiGood() {
		System.out.println("Running isGandhigiGood in BooleanConfigCls");
		return true;
	}

	@Bean
	public boolean isRamGood() {
		System.out.println("Running isRamGood in BooleanConfigCls");
		return true;
	}

	@Bean
	public Boolean isBasavannaGood() {
		System.out.println("Running isBasavannaGood in BooleanConfigCls");
		return true;
	}
}
