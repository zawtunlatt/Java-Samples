package com.jsamples.core_java.java_syntax.app;

public class App {
	// Default Access Modifier
	static int num = 0;
	
	static public void main(String[] aaa) {
		System.out.println("Hello World");
	}
	
	public static void method2() {
		num = 7;
	}
}


class Hello2 {
	public static void mywork() {
		App.num = 100;
	}
}