package com.xworkz.horror.boot;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.horror.configuration.CollectionConfigCls;

public class CollectionConfigRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(CollectionConfigCls.class);
		System.out.println(spring.getBeanDefinitionCount());

		List<Integer> age = spring.getBean("age", List.class);
		age.forEach(System.out::println);

		List<Character> nameStartingChar = spring.getBean("nameStartingChar", List.class);
		nameStartingChar.forEach(System.out::println);

		List<Short> floors = spring.getBean("floors", List.class);
		floors.forEach(System.out::println);

		Set<Double> weight = spring.getBean("weight", Set.class);
		weight.forEach(System.out::println);

		Set<String> names = spring.getBean("names", Set.class);
		names.forEach(System.out::println);
		
		Set<Integer> ages = spring.getBean("ages", Set.class);
		ages.forEach(System.out::println);

	}

}
