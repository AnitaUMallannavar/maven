package com.xworkz.horror.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.horror.configuration.IntegerCongigCls;

public class IntegeConfigRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(IntegerCongigCls.class);
	//	System.out.println(spring.getBeanDefinitionNames());
		System.out.println(spring.getBeanDefinitionCount());

		Integer age = spring.getBean("age", Integer.class);
		System.out.println("Age :" + age);

		Integer id = spring.getBean("id", Integer.class);
		System.out.println("id:" + id);

		Integer srNo = spring.getBean("srNo", Integer.class);
		System.out.println("srNo :" + srNo);

		Integer homeNo = spring.getBean("homeNo", Integer.class);
		System.out.println("homeNo :" + homeNo);

		Integer blockNo = spring.getBean("blockNo", Integer.class);
		System.out.println("blockNo :" + blockNo);

		Integer areaNo = spring.getBean("areaNo", Integer.class);
		System.out.println("areaNo :" + areaNo);

		Integer noOfFloor = spring.getBean("noOfFloor", Integer.class);
		System.out.println("noOfFloor :" + noOfFloor);

		Integer cityCode = spring.getBean("cityCode", Integer.class);
		System.out.println("cityCode :" + cityCode);

		Integer cityId = spring.getBean("cityId", Integer.class);
		System.out.println("cityId :" + cityId);

	}

}
