package com.pluralsight.typeconversion;

public class Main {

	public static void main (String[] args) {
		
		float floatVal = 1.0f;
		double doubleVal = 4.0d;
		byte byteVal = 7;
		short shortVal = 7;
		long longVal = 5;
		

		//Example of widening implicit convertion
		short result1 = byteVal;
		
		//If I try to implicity narrow I will receive a Compiler error and I will need an explicit cast
		short result2 = (short) longVal;
		
		//I can also define an explicit cast between parentesis
		short result3 = (short) (byteVal - longVal);
		
		//Since double converted to long if widening, the convertion will be donde implicitly
		double result4 = longVal - doubleVal;
		
		System.out.println("Success");
		System.out.println(result4);
		
	}
	
}
