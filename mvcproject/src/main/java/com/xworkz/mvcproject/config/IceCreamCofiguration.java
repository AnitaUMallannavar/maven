package com.xworkz.mvcproject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.mvcproject")
public class IceCreamCofiguration {
      public IceCreamCofiguration() {
		System.out.println("create"+this.getClass().getSimpleName());
	}
}
