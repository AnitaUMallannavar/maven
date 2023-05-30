package com.xworkz.webInit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.webInit")
public class TeaConfiguration {
	public TeaConfiguration() {
		System.out.println("create" + this.getClass().getSimpleName());
	}
}
