package com.pluralsight.classes;



public class Main {
	
	static public void main (String[] args) {
		
		System.out.println("** start of program **");
		
		Flight flight1 = new Flight();
		
		flight1.add1passenger();
		flight1.add1passenger();
		flight1.printpassengers();
		
		System.out.println("** end of program **");
	}

}
