package com.xworkz.autowired.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.config.ConfigurationCls;
import com.xworkz.autowired.things.Musuem;

public class MusuemRunner {
	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(ConfigurationCls.class);
		System.out.println(spring.getBeanDefinitionCount());
		Musuem musuem = spring.getBean(Musuem.class);
		System.out.println(musuem);
	}
}
