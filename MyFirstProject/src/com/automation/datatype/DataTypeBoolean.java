package com.automation.datatype;

public class DataTypeBoolean {
	int k; 
	// This is an instance variable or Global variables
	// Instance/global variables are allocated with default value
	boolean cf;

	public static void main(String[] args) {
		// classname referencevariable = new operator classname();
		DataTypeBoolean dtataTypeBoolean = new DataTypeBoolean();
		System.out.println("K value: "+dtataTypeBoolean.k);
		System.out.println("cf value: "+dtataTypeBoolean.cf);
		dtataTypeBoolean.test(0, 0);
		// Syntax
		//  dataType variable name;
		// dataType variable name = value;
		// local variable are not allowed to use without assigning a value;
		
		boolean flag; // Local variable
		boolean flag1 = false;
		flag = true;
		
		System.out.println(flag);
		System.out.println(flag1);
		
		int a;
		int a1 = 931234563;
		System.out.println(a1);
		
		
		float f;
		float f1 = 12.12f;
		System.out.println( f1);
		
		char c;
		char c1  ='c';
		
		byte b;
		byte b1=12;
		
		long l;
		long l1=931234563455l;
		
		short s;
		short s2= 122;
		
		double d;
		double d1=12344.23;
		
	}
	
	public void test(int a, float f) {
		int aa=10;
		//System.out.println(flag1);
		System.out.println(k);
		
	}

	public void test2(int a) {
		// 
		int aa=10;
		//System.out.println(flag1);
		System.out.println(k);
		
	}
}
