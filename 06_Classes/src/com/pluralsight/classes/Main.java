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
		
		for (int i = 0; i < 50; i++)
			lax1.add1passenger();
		
		lax1.printpassengers();				// lax1 has 160 passengers
		
		for (int i = 0; i < 40; i++)
			lax2.add1passenger();
		
		lax2.printpassengers();				// lax2 has 300 passengers
		
		// we want to add some code to add passengers to both flights
		
		Flight lax3 = null;						// We create a new FLight reference lax3
												// NULL means lax3 is pointing to no object
		
		if (lax1.hasRoom(lax2));	// return true if lax1.passengers + lax2.passengers is < or = to seats
			lax3 = lax1.createNewWithBoth(lax2); // if passengers in lax2 and lax1 flight are < or = to seats 
												 // then create lax3 with passengers = addition of both
		/*
		 * Section null reference
		 * 		If there wasn´t room to convine both, lax3 will be set to nothing 
		 * 		and local variables cannot be uninnitialited
		 * 
		 * 		Initializing objects to null and checking in the object is not null is a good practice to handle 
		 * 		objects that are a result from class methods 
		 * */		
		
		if (lax3 != null) {
			lax3.printpassengers();
			System.out.println("Flights combined");
		}
		
		System.out.println("** end of program **");
	}

}
