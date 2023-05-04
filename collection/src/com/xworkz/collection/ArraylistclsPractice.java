package com.xworkz.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistclsPractice {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("aaaaa");
		names.add("babu");
		names.add("channu");
		names.add("basu");
		names.add("priya");
		names.add("aniket");
		System.out.println(names.size());
		System.out.println(names);

		names.remove(2);
		names.forEach(s -> System.out.println(s.toUpperCase()));

		System.out.println("Running LinkedList........");
		List<String> name = new LinkedList<String>();
		name.add("Anita");
		name.add("Basavaraj");
		name.add("Sandeep");
		name.add("Asha");
		name.add("Usha");
		System.out.println(name);
		System.out.println("total no of elements :" + name.size());
		name.remove(2);
		name.forEach(s -> System.out.println(s));

	}

}
