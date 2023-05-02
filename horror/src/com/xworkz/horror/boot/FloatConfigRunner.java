package com.xworkz.horror.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.horror.configuration.FloatConfigCls;

public class FloatConfigRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(FloatConfigCls.class);
		System.out.println(spring.getBeanDefinitionCount());

		Float weight = spring.getBean("weight", Float.class);
		System.out.println("weight:" + weight);

		Float weight2 = spring.getBean("weight2", Float.class);
		System.out.println("weight2:" + weight2);

		Float weight3 = spring.getBean("weight3", Float.class);
		System.out.println("weight3:" + weight3);

		Float areaInKm = spring.getBean("areaInKm", Float.class);
		System.out.println("areaInKm:" + areaInKm);

		Float petrolCostPerLiter = spring.getBean("petrolCostPerLiter", Float.class);
		System.out.println("petrolCostPerLiter:" + petrolCostPerLiter);

		Float desailCostPerLiter = spring.getBean("desailCostPerLiter", Float.class);
		System.out.println("desailCostPerLiter:" + desailCostPerLiter);

		Float grapesCost = spring.getBean("grapesCost", Float.class);
		System.out.println("grapesCost:" + grapesCost);

		Float honeyCost = spring.getBean("honeyCost", Float.class);
		System.out.println("honeyCost:" + honeyCost);

		Float colorCode = spring.getBean("colorCode", Float.class);
		System.out.println("colorCode:" + colorCode);

	}

}
