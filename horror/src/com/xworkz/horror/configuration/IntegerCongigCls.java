package com.xworkz.horror.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.ToString;

@Configuration
@ToString
public class IntegerCongigCls {
    @Bean  
	public Integer age() {
		System.out.println("registering age in IntegerCongigCls");
		return 21;
	}
	@Bean
	public Integer id() {
		System.out.println("registering id in IntegerCongigCls");
		return 12;
	}
	@Bean
	public Integer srNo() {
		System.out.println("registering srNo in IntegerCongigCls");
		return 1;
	}
	@Bean
	public Integer homeNo() {
		System.out.println("registering homeNo in IntegerCongigCls");
		return 432;
	}
	@Bean
	public Integer blockNo() {
		System.out.println("registering bloackNo in IntegerCongigCls");
		return 8;
	}
	@Bean
	public Integer areaNo() {
		System.out.println("registering areaNo in IntegerCongigCls");
		return 23;
	}
	@Bean
	public Integer noOfFloor() {
		System.out.println("registering noOfFloor in IntegerCongigCls");
		return 23;
	}
	@Bean
	public Integer cityCode() {
		System.out.println("registering cityCode in IntegerCongigCls");
		return 52438;
	}
	@Bean
	public Integer cityId() {
		System.out.println("registering cityId in IntegerCongigCls");
		return 21;
	}
	
}
