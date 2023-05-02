package com.xworkz.horror.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.horror.configuration.LongConfigCls;

public class LongConfigRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(LongConfigCls.class);
		System.out.println(spring.getBeanDefinitionCount());

		Long fatherPhoneNo = spring.getBean("fatherPhoneNo", Long.class);
		System.out.println("fatherPhoneNo:" + fatherPhoneNo);

		Long motherPhoneNo = spring.getBean("motherPhoneNo", Long.class);
		System.out.println("motherPhoneNo:" + motherPhoneNo);

		Long brotherPhoneNo = spring.getBean("brotherPhoneNo", Long.class);
		System.out.println("brotherPhoneNo:" + brotherPhoneNo);

		Long sisterPhoneNo = spring.getBean("sisterPhoneNo", Long.class);
		System.out.println("sisterPhoneNo:" + sisterPhoneNo);

		Long homePhoneNo = spring.getBean("homePhoneNo", Long.class);
		System.out.println("homePhoneNo:" + homePhoneNo);

		Long hodPhoneNo = spring.getBean("hodPhoneNo", Long.class);
		System.out.println("hodPhoneNo:" + hodPhoneNo);

		Long myPhoneNo = spring.getBean("myPhoneNo", Long.class);
		System.out.println("myPhoneNo:" + myPhoneNo);

		Long yourPhoneNo = spring.getBean("yourPhoneNo", Long.class);
		System.out.println("yourPhoneNo:" + yourPhoneNo);

		Long herPhoneNo = spring.getBean("herPhoneNo", Long.class);
		System.out.println("herPhoneNo:" + herPhoneNo);

	}

}
