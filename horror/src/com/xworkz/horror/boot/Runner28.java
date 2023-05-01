package com.xworkz.horror.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.horror.configuration.ClassConfiguration;
import com.xworkz.horror.programs.Barber;
import com.xworkz.horror.programs.Chair;
import com.xworkz.horror.programs.HairDryer;
import com.xworkz.horror.programs.Mirror;
import com.xworkz.horror.programs.Saloon;
import com.xworkz.horror.programs.Scissor;
import com.xworkz.horror.programs.ShavingCream;
import com.xworkz.horror.programs.Trimmer;

public class Runner28 {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(ClassConfiguration.class);

		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);

		int count = spring.getBeanDefinitionCount();
		System.out.println(count);

		Saloon bean = spring.getBean(Saloon.class, Scissor.class);
		System.out.println(bean.toString());

		Scissor nean2 = spring.getBean(Scissor.class);
		System.out.println(nean2.toString());

		Chair chair = spring.getBean(Chair.class);
		System.out.println(chair.toString());

		ShavingCream shavingCream = spring.getBean(ShavingCream.class);
		System.out.println(shavingCream.toString());

		Mirror mirror = spring.getBean(Mirror.class);
		System.out.println(mirror.toString());

		HairDryer hairDryer = spring.getBean(HairDryer.class);
		System.out.println(hairDryer.toString());

		Trimmer trimmer = spring.getBean(Trimmer.class);
		System.out.println(trimmer.toString());

		Barber barber = spring.getBean(Barber.class);
		System.out.println(barber.toString());
	}

}
