package com.xworkz.horror.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.horror.configuration.ShortConfigCls;

public class ShortConfigRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(ShortConfigCls.class);
		System.out.println(spring.getBeanDefinitionCount());

		Short grapesCost = spring.getBean("grapesCost", Short.class);
		System.out.println("grapesCost:" + grapesCost);

		Short butterCost = spring.getBean("butterCost", Short.class);
		System.out.println("butterCost:" + butterCost);

		Short panipuriCost = spring.getBean("panipuriCost", Short.class);
		System.out.println("panipuriCost:" + panipuriCost);

		Short gobimanchuriCost = spring.getBean("gobimanchuriCost", Short.class);
		System.out.println("gobimanchuriCost:" + gobimanchuriCost);

		Short pizzaCost = spring.getBean("pizzaCost", Short.class);
		System.out.println("pizzaCost:" + pizzaCost);

		Short burgorCost = spring.getBean("burgorCost", Short.class);
		System.out.println("burgorCost:" + burgorCost);

		Short milkCost = spring.getBean("milkCost", Short.class);
		System.out.println("milkCost:" + milkCost);

		Short curdCost = spring.getBean("curdCost", Short.class);
		System.out.println("curdCost:" + curdCost);

		Short geeCost = spring.getBean("geeCost", Short.class);
		System.out.println("geeCost:" + geeCost);
	}

}
