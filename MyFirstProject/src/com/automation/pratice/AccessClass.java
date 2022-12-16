package com.automation.pratice;

public class AccessClass {

	public static void main(String[] args) {
		EncapsulationExample encapsulationExample = new EncapsulationExample();
		System.out.println(encapsulationExample.getA());
		encapsulationExample.b=200;
		
		System.out.println(encapsulationExample.b);
		encapsulationExample.setA(300);
		System.out.println(encapsulationExample.getA());
	}

}
