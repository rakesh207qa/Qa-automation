package com.automation.datatype;

public class ExampleClass {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		
		
		double sum = exampleClass.getAddtion(1, 3);
		System.out.println(sum);
		
		exampleClass.getAdd(8, 3);
		//System.out.println();
	}

	
	public double getAddtion(int a, int b) {
		return a+b;
	}
	
	public void getAdd(int a, int b) {
		
		System.out.println(a+b);
	}
	
}//testing
