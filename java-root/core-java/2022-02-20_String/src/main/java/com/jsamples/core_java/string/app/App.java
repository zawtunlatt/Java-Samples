package com.jsamples.core_java.string.app;

public class App {

	public static void main(String[] args) {
		
		String s0 = new String("Hello"); // Avoid normally
		
		String s1 = "Hello";
		
		String s2 = "Hello";
		
		System.out.println("s1 == s2 : " + (s1 == s2));

		
		String s3 = new String("Hi");
		
		String s4 = new String("Hi");
		
		System.out.println("s3 == s4 : " + (s3 == s4));
		System.out.println("s3 equals? s4 : " + (s3.equals(s4)));
		
		
		//...................
		
		String s5 = "Hello World";
		int index = 6;
		char c = s5.charAt(index);
		System.out.println("c at " + index + " : " + c);
		
		int code_point = s5.codePointAt(index);
		System.out.println(code_point);
		
		int compared = s5.compareTo("hero");
		System.out.println(compared);
		
		int compared_2 = s5.compareToIgnoreCase("hero");
		System.out.println(compared_2);

	}

}
