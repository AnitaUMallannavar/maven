package com.xworkz.horror.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.ToString;

@Configuration

@ToString
public class StringconfigCls {
	
	@Bean
     public String email() {
    	 System.out.println("Running email method in StringconfigCls");
    	 return "anita@gmail.com";
     }
	@Bean
	public String name() {
		System.out.println("Running name method in StringconfigCls");
		return "Anita";
	}
	
	@Bean
	public String middaleName() {
		System.out.println("Running middalename method in StringconfigCls ");
		return "Umesh";
	}
	
	@Bean
	public String lastName() {
		System.out.println("Running lastname method in StringconfigCls ");
		return "Mallannavar";
	}
	
	@Bean
	public String addrass() {
		System.out.println("Running addrass method in StringconfigCls ");
		return "Distric/Taluck:Vijayapur @post:Kambhagi";
	}
	
	@Bean
	public String location() {
		System.out.println("Running location method in StringconfigCls ");
		return "Vijayapur ";
	}
	
	@Bean
	public String phoneNo() {
		System.out.println("Running phoneNo method in StringconfigCls ");
		return "8105988974 ";
	}
	
	@Bean
	public String homeName() {
		System.out.println("Running homeName method in StringconfigCls ");
		return "Annapurn Nilaya ";
	}
	
	@Bean
	public String homeNo() {
		System.out.println("Running homeNo method in StringconfigCls ");
		return "123123";
	}
	@Bean
	public String homeFloor() {
		System.out.println("Running homeFloor method in StringconfigCls ");
		return "4 ";
	}
	
	@Bean
	public String area() {
		System.out.println("Running area method in StringconfigCls ");
		return "BLDE Road:4th Block ";
	}
	
	@Bean
	public String nearShop() {
		System.out.println("Running nearShop method in StringconfigCls ");
		return "Anil T Stroll";
	}
	
	@Bean
	public String nearTemple() {
		System.out.println("Running nearTemple method in StringconfigCls ");
		return "Basavann temple";
	}
	
}
