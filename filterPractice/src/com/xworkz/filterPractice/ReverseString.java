package com.xworkz.filterPractice;

public class ReverseString {

	public static void main(String[] args) {
		String name="Anita";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			//rev=rev+name.charAt(i);
			rev+=name.charAt(i);
		}
        System.out.println("original name:"+name);
        System.out.println("reversed name:"+rev);
	}

}
