package com.xworkz.horror.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LongConfigCls {

	@Bean
	public Long fatherPhoneNo() {
		System.out.println("registering fatherPhoneNo in LongConfigCls");
		return 9449025212L;
	}

	@Bean
	public Long motherPhoneNo() {
		System.out.println("registering motherPhoneNo in LongConfigCls");
		return 9449847610L;
	}

	@Bean
	public Long brotherPhoneNo() {
		System.out.println("registering brotherPhoneNo in LongConfigCls");
		return 9945915376L;
	}

	@Bean
	public Long sisterPhoneNo() {
		System.out.println("registering sisterPhoneNo in LongConfigCls");
		return 94490235322L;
	}

	@Bean
	public Long homePhoneNo() {
		System.out.println("registering homePhoneNo in LongConfigCls");
		return 9449025212L;
	}

	@Bean
	public Long hodPhoneNo() {
		System.out.println("registering hodPhoneNo in LongConfigCls");
		return 9449025212L;
	}

	@Bean
	public Long myPhoneNo() {
		System.out.println("registering myPhoneNo in LongConfigCls");
		return 9449025212L;
	}

	@Bean
	public Long yourPhoneNo() {
		System.out.println("registering yourPhoneNo in LongConfigCls");
		return 9449025212L;
	}

	@Bean
	public Long herPhoneNo() {
		System.out.println("registering herPhoneNo in LongConfigCls");
		return 94495136281L;
	}
}
