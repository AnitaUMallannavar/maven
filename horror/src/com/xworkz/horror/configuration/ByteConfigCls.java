package com.xworkz.horror.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ByteConfigCls {

	@Bean
	public Byte anitaAge() {
		System.out.println("registering anitaage in ByteConfigCls");
		return 21;
	}

	@Bean
	public Byte akshataAge() {
		System.out.println("registering akshataAge in ByteConfigCls");
		return 21;
	}

	@Bean
	public Byte shubhangiAge() {
		System.out.println("registering shubhangiAge in ByteConfigCls");
		return 22;
	}

	@Bean
	public Byte savitriAge() {
		System.out.println("registering savitriAge in ByteConfigCls");
		return 24;
	}

	@Bean
	public Byte ashaAge() {
		System.out.println("registering ashaAge in ByteConfigCls");
		return 31;
	}

	@Bean
	public Byte shrutiAge() {
		System.out.println("registering shrutiAge in ByteConfigCls");
		return 23;
	}

	@Bean
	public Byte bhairaviAge() {
		System.out.println("registering bhairaviAge in ByteConfigCls");
		return 24;
	}

	@Bean
	public Byte priyankaAge() {
		System.out.println("registering priyankaAge in ByteConfigCls");
		return 25;
	}

	@Bean
	public Byte ushaAge() {
		System.out.println("registering ushaAge in ByteConfigCls");
		return 29;
	}
}
