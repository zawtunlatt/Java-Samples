package com.jsamples.core_java.data_types.app;

/**
 * 
 * @author zawtunlatt
 * created : 2022-01-25
 */
public class App {
	boolean flag;
	int age;
	String name;
	
	private static void testBasicVariable() {
		// Primitive Type
		byte by = 127; // 10101010
		short s = 30000;
		int i = 10000;
		long l1 = 1; // Why not L
		long l2 = 1234535L; 
		float f = 110.5F; // Why f
		double d = 110.555; // Why d
		
		boolean bool = true; // or false
		char c = 'a';
		
		int ascii = c;
		System.out.println("Ascii : " + ascii);
		
		// Reference Type
		// TODO : Explanation Required => new String("");
		String st1 = "Hello World";
		String st2 = new String("Hello World"); // This should be avoided.
		
		int decimal = 100;
		int octal = 011;
		int hexa =  0x11;
		int binary = 0b11111;
		System.out.println(binary);
		
		{
			// Block Scope
			int myAge = 10;
		}
		
	}
	
	public static void main(String[] args) {
		testBasicVariable();
	}

}
