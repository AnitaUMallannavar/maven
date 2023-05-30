package com.xworkz.mvcPre.programs;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.mvcPre.config.CoffeeConfiguration;

public class Coffee extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	public Coffee() {
		System.out.println("Creating no args constructor in MVCDemo...");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		return new Class[] { CoffeeConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getservletMappings");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
