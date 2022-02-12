package com.jsamples.core_java.operators.app;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		App main = new App();
		
		if (!(main.isOK1() || main.isOK2())) {
			System.out.println("Main is processing : OK");
		} else {
			System.out.println("Main is processing : NG");
		}
		
		main.isOK3();
	}
	
	
	public boolean isOK1() {
		System.out.println("OK 1 is processing");
		return true;
	}
	
	public boolean isOK2() {
		System.out.println("OK 2 is processing");
		
		// new Main().isOK3();
		
		return true;
	}
	
	public boolean isOK3() {
		int num = (true) ? (false) ? 200 : (true) ? 33 : 77 : 100; // Should avoid this style in real project
		System.out.println(num);
		
		return false;
	}

}
