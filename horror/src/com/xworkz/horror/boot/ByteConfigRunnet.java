package com.xworkz.horror.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.horror.configuration.ByteConfigCls;

public class ByteConfigRunnet {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(ByteConfigCls.class);
		System.out.println(spring.getBeanDefinitionCount());

		Byte anitaAge = spring.getBean("anitaAge", Byte.class);
		System.out.println("anitaAge:" + anitaAge);

		Byte akshataAge = spring.getBean("akshataAge", Byte.class);
		System.out.println("akshataAge:" + akshataAge);

		Byte shubhangiAge = spring.getBean("shubhangiAge", Byte.class);
		System.out.println("shubhangiAge:" + shubhangiAge);

		Byte savitriAge = spring.getBean("savitriAge", Byte.class);
		System.out.println("savitriAge:" + savitriAge);

		Byte ashaAge = spring.getBean("ashaAge", Byte.class);
		System.out.println("ashaAge:" + ashaAge);

		Byte shrutiAge = spring.getBean("shrutiAge", Byte.class);
		System.out.println("shrutiAge:" + shrutiAge);

		Byte bhairaviAge = spring.getBean("bhairaviAge", Byte.class);
		System.out.println("bhairaviAge:" + bhairaviAge);

		Byte priyankaAge = spring.getBean("priyankaAge", Byte.class);
		System.out.println("priyankaAge:" + priyankaAge);

		Byte ushaAge = spring.getBean("ushaAge", Byte.class);
		System.out.println("ushaAge:" + ushaAge);
	}

}
