package com.xworkz.horror.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.horror.configuration.CharacterConfigCls;

public class CharacterConfigRunner {

	public static void main(String[] args) {
		ApplicationContext springs = new AnnotationConfigApplicationContext(CharacterConfigCls.class);
		System.out.println(springs.getBeanDefinitionCount());

		Character dressSize1 = springs.getBean("dressSize1", Character.class);
		System.out.println("dressSize1:" + dressSize1);

		Character dressSize2 = springs.getBean("dressSize2", Character.class);
		System.out.println("dressSize2:" + dressSize2);

		Character dressSize3 = springs.getBean("dressSize3", Character.class);
		System.out.println("dressSize3:" + dressSize3);

		Character nameStartsWith = springs.getBean("nameStartsWith", Character.class);
		System.out.println("nameStartsWith:" + nameStartsWith);

		Character nameEndsWith = springs.getBean("nameEndsWith", Character.class);
		System.out.println("nameEndsWith:" + nameEndsWith);

		Character MNameEndsWith = springs.getBean("MNameEndsWith", Character.class);
		System.out.println("MNameEndsWith:" + MNameEndsWith);

		Character MNameStartsWith = springs.getBean("MNameStartsWith", Character.class);
		System.out.println("MNameStartsWith:" + MNameStartsWith);

		Character LNameStartsWith = springs.getBean("LNameStartsWith", Character.class);
		System.out.println("LNameStartsWith:" + LNameStartsWith);

		Character LNameEndsWith = springs.getBean("LNameEndsWith", Character.class);
		System.out.println("LNameEndsWith:" + LNameEndsWith);

	}

}
