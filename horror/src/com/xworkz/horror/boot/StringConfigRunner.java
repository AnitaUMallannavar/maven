package com.xworkz.horror.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.horror.configuration.StringconfigCls;

public class StringConfigRunner {

	public static void main(String[] args) {
		ApplicationContext spring1 = new AnnotationConfigApplicationContext(StringconfigCls.class);
		System.out.println(spring1.getBeanDefinitionCount());

		String email = spring1.getBean("email", String.class);
		System.out.println("email:" + email);

		String name = spring1.getBean("name", String.class);
		System.out.println("name:" + name.toUpperCase());

		String mName = spring1.getBean("middaleName", String.class);
		System.out.println("middaleName:" + mName.toUpperCase());

		String lName = spring1.getBean("lastName", String.class);
		System.out.println("lastName:" + lName.toUpperCase());

		String addrass1 = spring1.getBean("addrass", String.class);
		System.out.println("Addrass:" + addrass1.toUpperCase());

		String location1 = spring1.getBean("location", String.class);
		System.out.println("location:" + location1.toUpperCase());

		String phone = spring1.getBean("phoneNo", String.class);
		System.out.println("phoneNo:" + phone);

		String hName = spring1.getBean("homeName", String.class);
		System.out.println("HomeName:" + hName);

		String hNo = spring1.getBean("homeNo", String.class);
		System.out.println("HomeNo:" + hNo);

		String hFloor = spring1.getBean("homeFloor", String.class);
		System.out.println("HomeFloor:" + hFloor);

		String area = spring1.getBean("area", String.class);
		System.out.println("Area:" + area);

		String nearShop = spring1.getBean("nearShop", String.class);
		System.out.println("nearShop name:" + nearShop);

		String nearTemple = spring1.getBean("nearTemple", String.class);
		System.out.println("NearTemple name:" + nearTemple);
		System.out.println("========================");
		
		System.out.println();
		Integer age = spring1.getBean("age", Integer.class);
		System.out.println("Age :" + age);

		Integer id = spring1.getBean("id", Integer.class);
		System.out.println("id:" + id);

	}

}
