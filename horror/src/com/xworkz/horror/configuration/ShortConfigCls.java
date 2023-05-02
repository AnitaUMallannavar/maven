package com.xworkz.horror.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShortConfigCls {
	@Bean
	public Short grapesCost() {
		System.out.println("Running grapesCost in ShortConfigCls");
		return 45;
	}

	@Bean
	public Short butterCost() {
		System.out.println("Running butterCost in ShortConfigCls");
		return 45;
	}

	@Bean
	public Short panipuriCost() {
		System.out.println("Running panipuriCost in ShortConfigCls");
		return 45;
	}

	@Bean
	public Short gobimanchuriCost() {
		System.out.println("Running gobimanchuriCost in ShortConfigCls");
		return 90;
	}

	@Bean
	public Short pizzaCost() {
		System.out.println("Running pizzaCost in ShortConfigCls");
		return 245;
	}

	@Bean
	public Short burgorCost() {
		System.out.println("Running burgorCost in ShortConfigCls");
		return 99;
	}

	@Bean
	public Short milkCost() {
		System.out.println("Running milkCost in ShortConfigCls");
		return 45;
	}

	@Bean
	public Short curdCost() {
		System.out.println("Running curdCost in ShortConfigCls");
		return 45;
	}

	@Bean
	public Short geeCost() {
		System.out.println("Running geeCost in ShortConfigCls");
		return 380;
	}
}
