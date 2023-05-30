package com.xworkz.mvcproject;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.mvcproject.config.IceCreamCofiguration;

public class IceCream extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{
	
	public IceCream() {
		System.out.println("Creating no args constructor in IceCream");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses method");
		return  new Class[] {IceCreamCofiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings method");
		return new String[] {"/"};
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling");
		configurer.enable();
	}

}
