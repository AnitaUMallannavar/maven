package com.xworkz.horror.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.horror.configuration.BooleanConfigCls;

public class BooleanConfigRunner {

	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(BooleanConfigCls.class);
		System.out.println(spring.getBeanDefinitionCount());
		
		Boolean isKrishnaGood= spring.getBean("isKrishnaGood",Boolean.class);
		System.out.println("isKrishnaGood:"+isKrishnaGood);
		
		Boolean isHanumanGood= spring.getBean("isHanumanGood",Boolean.class);
		System.out.println("isHanumanGood:"+isHanumanGood);
		
		Boolean isMahalaxmiGood= spring.getBean("isMahalaxmiGood",Boolean.class);
		System.out.println("isMahalaxmiGood:"+isMahalaxmiGood);
		
		Boolean isGaneshGood= spring.getBean("isGaneshGood",Boolean.class);
		System.out.println("isGaneshGood:"+isGaneshGood);
		
		Boolean isKannikaParameshwariGood= spring.getBean("isKannikaParameshwariGood",Boolean.class);
		System.out.println("isKannikaParameshwariGood:"+isKannikaParameshwariGood);
		
		Boolean isSaibabaGood= spring.getBean("isSaibabaGood",Boolean.class);
		System.out.println("isSaibabaGood:"+isSaibabaGood);
		
		Boolean isGandhigiGood= spring.getBean("isGandhigiGood",Boolean.class);
		System.out.println("isGandhigiGood:"+isGandhigiGood);
		
		Boolean isRamGood= spring.getBean("isRamGood",Boolean.class);
		System.out.println("isRamGood:"+isRamGood);
		
		Boolean isBasavannaGood= spring.getBean("isBasavannaGood",Boolean.class);
		System.out.println("isBasavannaGood:"+isBasavannaGood);
		

	}

}
