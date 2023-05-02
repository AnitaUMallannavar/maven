package com.xworkz.horror.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.horror.configuration.NamesConfigClass;
import com.xworkz.horror.onlyProgram.AkshataConfigCls;
import com.xworkz.horror.onlyProgram.AshaCls;
import com.xworkz.horror.onlyProgram.BhairaviConfigCls;
import com.xworkz.horror.onlyProgram.DishaCls;
import com.xworkz.horror.onlyProgram.NishaCls;
import com.xworkz.horror.onlyProgram.Poojacls;
import com.xworkz.horror.onlyProgram.PriyankaConfigCls;
import com.xworkz.horror.onlyProgram.SavitriConfigCls;
import com.xworkz.horror.onlyProgram.ShaaCls;
import com.xworkz.horror.onlyProgram.ShrishaCls;
import com.xworkz.horror.onlyProgram.ShrutiConfigCls;
import com.xworkz.horror.onlyProgram.ShubhangiConfigCls;
import com.xworkz.horror.onlyProgram.UshaCls;

public class NamesConfigRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(NamesConfigClass.class);
		System.out.println(spring.getBeanDefinitionCount());

		System.out.println("1>Akshata class..........");
		AkshataConfigCls akshata = spring.getBean(AkshataConfigCls.class);
		Stream.of(akshata).forEach(System.out::println);
		String education = akshata.education();
		System.out.println("education" + education);

		System.out.println("2>Shubhangi class..........");
		ShubhangiConfigCls shubha = spring.getBean(ShubhangiConfigCls.class);
		Stream.of(shubha).forEach(System.out::println);
		String education1 = shubha.education();
		System.out.println(education1);

		System.out.println("3>Savitri class............");

		SavitriConfigCls savitri = spring.getBean(SavitriConfigCls.class);
		Stream.of(savitri).forEach(System.out::println);
		String edu = savitri.education();
		System.out.println(edu);

		System.out.println("4>Bhairavi class.......");
		BhairaviConfigCls bhairavi = spring.getBean(BhairaviConfigCls.class);
		Stream.of(bhairavi).forEach(System.out::println);

		System.out.println("");

		System.out.println("5>Shriti class......");
		ShrutiConfigCls shruti = spring.getBean(ShrutiConfigCls.class);
		Stream.of(shruti).forEach(System.out::println);
		String educ = shruti.education();
		System.out.println(educ);

		System.out.println("6>Priyanka class.....");
		PriyankaConfigCls priya = spring.getBean(PriyankaConfigCls.class);
		Stream.of(priya).forEach(System.out::println);
		String educa = priya.education();
		System.out.println(educa);

		System.out.println("7>Pooja class.....");
		Poojacls pooja = spring.getBean(Poojacls.class);
		Stream.of(pooja).forEach(System.out::println);

		System.out.println("8>Asha class.......");
		AshaCls asha = spring.getBean(AshaCls.class);
		Stream.of(asha).forEach(System.out::println);

		System.out.println("9>Usha class........");
		UshaCls usha = spring.getBean(UshaCls.class);
		Stream.of(usha).forEach(System.out::println);
		usha.education();

		System.out.println("10>Disha class........");
		DishaCls disha = spring.getBean(DishaCls.class);
		Stream.of(disha).forEach(System.out::println);

		System.out.println("11>Nisha class......");
		NishaCls nisha = spring.getBean(NishaCls.class);
		Stream.of(nisha).forEach(System.out::println);

		System.out.println("12>Shrisha class......");
		ShrishaCls shri = spring.getBean(ShrishaCls.class);
		Stream.of(shri).forEach(System.out::println);

		System.out.println("13>Shaa class.........");
		ShaaCls shaa = spring.getBean(ShaaCls.class);
		Stream.of(shaa).forEach(System.out::println);

	}

}
