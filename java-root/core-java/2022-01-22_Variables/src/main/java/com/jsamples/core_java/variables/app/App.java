package com.jsamples.core_java.variables.app;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



class Greeting {
	// class variables are inside class with static keywords
	static String classVar = "This is class variables";
	
	// instance variables are inside class without keywords
	String instanceVar = "This is instance variables";
	
	public void sayHello() {
		
		// Local Variables are inside methods
		String localVar = "Hello";
		System.out.println(localVar);
	}
	
	public void sayHello2() {
		
	}
}


class Greeting2 {
	public void sayHello() {
		String var1 = Greeting.classVar;
		
		Greeting g1 = new Greeting();
		g1.instanceVar = "Hello 1";
		
		Greeting g2 = new Greeting();
		g2.instanceVar = "Hello 2";
		
	}
}