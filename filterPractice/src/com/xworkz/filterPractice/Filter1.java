package com.xworkz.filterPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter1 {

	public static void main(String[] args) {
		/*
		 * List<Integer> num=Arrays.asList(1,2,3,4,5,6,7);
		 * 
		 * List<Integer> even=new ArrayList<Integer>();
		 * 
		 * for (int integer : num) { if(integer%2!=0) even.add(integer); }
		 * System.out.println(even);
		 */
		List<String> names = Arrays.asList("Anita", "Abhilasha", "Aniketh", "Rajeshwari");
	//	names.stream().filter(s -> s.length() > 8 && s.length() < 8).collect(Collectors.toList());
		names.stream().filter(s->s.length()>4 && s.length()<5).forEach(s->System.out.println(s.toLowerCase()));
				System.out.println(names);

	}

}
