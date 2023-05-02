package com.xworkz.horror.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.horror.configuration.DoubleConfigCls;

public class DoubleConfigRunner {

	public static void main(String[] args) {
		ApplicationContext springs = new AnnotationConfigApplicationContext(DoubleConfigCls.class);
		System.out.println(springs.getBeanDefinitionCount());

		Double weight = springs.getBean("weight", Double.class);
		System.out.println("weight:" + weight);

		Double height = springs.getBean("height", Double.class);
		System.out.println("height:" + height);

		Double areaInCM = springs.getBean("areaInCM", Double.class);
		System.out.println("areaInCM:" + areaInCM);

		Double cost = springs.getBean("cost", Double.class);
		System.out.println("cost:" + cost);

		Double salary = springs.getBean("salary", Double.class);
		System.out.println("salary:" + salary);

		Double phoneCode = springs.getBean("phoneCode", Double.class);
		System.out.println("phoneCode:" + phoneCode);

		Double gst = springs.getBean("gst", Double.class);
		System.out.println("gst:" + gst);

		Double storageInMB = springs.getBean("storageInMB", Double.class);
		System.out.println("storageInMB:" + storageInMB);

		Double distanInKM = springs.getBean("distanInKM", Double.class);
		System.out.println("distanInKM:" + distanInKM);
	}

}
