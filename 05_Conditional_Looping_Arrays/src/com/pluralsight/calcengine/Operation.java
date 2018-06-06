package com.pluralsight.calcengine;

public class Operation {
	
	public double result;
	public boolean error = false;
	
	public double addition (double val1, double val2) {
		result = val1 + val2;
		return result;
	}
	
	public double substraction (double val1, double val2) {
		result = val1 - val2;
		return result;
	}
	
	public double multiplication (double val1, double val2) {
		result = val1 * val2;
		return result;
	}
	
	public double divition (double val1, double val2) {
		if (val2 != 0)
			result = val1 / val2;
		else {
			System.out.println("Cannot divide by zero");
			return 0;
		}
		return result;
	}
}
