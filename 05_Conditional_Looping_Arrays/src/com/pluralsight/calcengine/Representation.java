package com.pluralsight.calcengine;

public class Representation {
	
	public void printOp(double val1, double val2, double result, char symbol) {
		
		System.out.print(val1);
		System.out.print(" ");
		System.out.print(symbol);
		System.out.print(" ");
		System.out.print(val2);
		System.out.print(" = ");
		System.out.print(result);
		System.out.println(" ");
	}

}
