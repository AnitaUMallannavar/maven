package com.xworkz.horror.configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionConfigCls {

	@Bean
	public List<Integer> age() {
		System.out.println("registering age  as Integer in CollectionConfigCls");
		List<Integer> age = new ArrayList<Integer>();
		age.add(23);
		age.add(24);
		age.add(25);
		age.add(26);
		age.add(27);
		return age;

	}

	@Bean
	public List<Character> nameStartingChar() {
		System.out.println("registering nameStartingChar using Character in CollectionConfigCls");

		List<Character> chars = new LinkedList<Character>();
		chars.add('A');
		chars.add('B');
		chars.add('C');
		chars.add('D');
		chars.add('E');
		return chars;
	}

	@Bean
	public List<Short> floors() {
		System.out.println("registering Floors using Short in CollectionConfigCls");

		List<Short> chars = new LinkedList<Short>();
		chars.add((short) 4);
		chars.add((short) 3);
		chars.add((short) 5);
		chars.add((short) 7);
		chars.add((short) 2);
		return chars;
	}

	@Bean
	public Set<Double> weight() {
		System.out.println("registering weight using Double in CollectionConfigCls");
		Set<Double> init = new HashSet<Double>();
		init.add(23.43);
		init.add(43.43);
		init.add(53.43);
		init.add(63.43);
		init.add(44.43);
		return init;
	}

	@Bean
	public Set<String> names() {
		System.out.println("registering names using String in CollectionConfigCls");
		Set<String> init = new LinkedHashSet();
		init.add("Akshata");
		init.add("Akash");
		init.add("Abhi");
		init.add("Appu");
		init.add("Anvita");
		init.add("Akshata");
		return init;
	}

	@Bean
	public Set<Integer> ages() {
		System.out.println("registering ages using Integers in CollectionConfigCls");
		Set<Integer> init = new TreeSet<Integer>();
		init.add(23);
		init.add(24);
		init.add(26);
		init.add(28);
		init.add(28);
		return init;
	}
}
