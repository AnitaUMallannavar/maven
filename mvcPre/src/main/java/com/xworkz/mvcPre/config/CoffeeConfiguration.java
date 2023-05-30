package com.xworkz.mvcPre.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.mvcPre")
public class CoffeeConfiguration {
	
public CoffeeConfiguration() {
	System.out.println("Create"+this.getClass().getSimpleName());
}	
      
}
