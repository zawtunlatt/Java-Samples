package com.jsamples.core_java.java_syntax.app;


public class Greeting {
	public static void mywork() {
		/*
		 *  Main.num is in same package, default access modifier
		 */
		App.num = 110;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}
