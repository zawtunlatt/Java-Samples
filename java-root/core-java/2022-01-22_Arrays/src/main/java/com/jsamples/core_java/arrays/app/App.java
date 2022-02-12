package com.jsamples.core_java.arrays.app;
import java.util.Arrays;


public class App {
	
	// Array Declaration
	String[] stArr;
	
	// Array Declaration, Instantiation  & Inaitialization
	String[] stArr2 = {"a","b", "c"};

	public static void main(String[] args) {
		
		// Instance field can't be accessed from static block
		//int arrLen = stArr.length;
		
		App arrayTest = new App();
		
		System.out.println(arrayTest.stArr);
		
		System.out.println(arrayTest.stArr2);
		System.out.println(Arrays.toString(arrayTest.stArr2));
		
		// Instance method can't be invoked from static method directly.  
		// modify();
		
		arrayTest.modify();
		
	}

	
	public void modify() {	
		// Array initializer block can be used only at array declaration time
		 // stArr = {"d","e", "f"};
		
		
		stArr = new String[5];
		System.out.println(stArr.length);
		System.out.println(stArr[5]);
		
		int arrlen = stArr2.length;
		System.out.println(arrlen);
	}
}
