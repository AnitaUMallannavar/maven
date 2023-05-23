package com.xworkz.autowired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowired.things")
public class ConfigurationCls {

	@Bean
	public String bulbBrand() {
		System.out.println("Creating bulbBrand in ConfigurationCls ");
		return "Philips";
	}

/*@Bean
	public int password() {
		System.out.println("Registering password in setBulbBrand");
		return 8105;
	}
	
	@Bean
	public double code() {
		System.out.println("Registering code in setBulbBrand");
		return 21.12;
	}
	
	@Bean
	public float codeCost() {
		System.out.println("Registering codeCost in ConfigurationCls");
		return 432.56F;
	}*/
}
