package com.xworkz.horror.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CharacterConfigCls {

	@Bean
	public Character dressSize1() {
		System.out.println("Registering dressSize1 in CharacterConfigCls");
		return 's';
	}

	@Bean
	public Character dressSize2() {
		System.out.println("Registering dressSize2 in CharacterConfigCls");
		return 'm';
	}

	@Bean
	public Character dressSize3() {
		System.out.println("Registering dressSize3 in CharacterConfigCls");
		return 'L';
	}

	@Bean
	public Character nameStartsWith() {
		System.out.println("Registering nameStartsWith in CharacterConfigCls");
		return 'A';
	}

	@Bean
	public Character nameEndsWith() {
		System.out.println("Registering nameEndsWith in CharacterConfigCls");
		return 'A';
	}

	@Bean
	public Character MNameEndsWith() {
		System.out.println("Registering MNameEndsWith in CharacterConfigCls");
		return 'h';
	}

	@Bean
	public Character MNameStartsWith() {
		System.out.println("Registering MNameStartsWith in CharacterConfigCls");
		return 'u';
	}

	@Bean
	public Character LNameStartsWith() {
		System.out.println("Registering LNameStartsWith in CharacterConfigCls");
		return 'M';
	}

	@Bean
	public Character LNameEndsWith() {
		System.out.println("Registering LNameEndsWith in CharacterConfigCls");
		return 'R';
	}

}
