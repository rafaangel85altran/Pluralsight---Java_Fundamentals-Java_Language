package com.pluralsight.classes;



public class Main {
	
	static public void main (String[] args) {
		
		System.out.println("** start of program **");
		
		/*
		 * Using Classes Section
		Flight flight1 = new Flight();
		
		flight1.add1passenger();
		flight1.add1passenger();
		flight1.printpassengers();
		*/
		
		/*
		 * Method return values section
		 * */
		
		Flight lax1 = new Flight();			// New instance lax1 of the class Flight (to Los Angeles) 
		Flight lax2 = new Flight();
		
		for (int i = 0; i < 4; i++)
			lax1.add1passenger();
		
		lax1.printpassengers();				// lax1 has 5 passengers
		
		for (int i = 0; i < 9; i++)
			lax2.add1passenger();
		
		lax2.printpassengers();				// lax2 has 10 passengers
		
		// we want to add some code to add passengers to both flights
		
		Flight lax3;						// We create a new FLight reference lax3
		
		if (lax1.hasRoom(lax2));	// return true if lax1.passengers + lax2.passengers is < or = to seats
			lax3 = lax1.createNewWithBoth(lax2); // if passengers in lax2 and lax1 flight are < or = to seats 
												 // then create lax3 with passengers = addition of both 
		lax3.printpassengers();
		
		System.out.println("** end of program **");
	}

}
