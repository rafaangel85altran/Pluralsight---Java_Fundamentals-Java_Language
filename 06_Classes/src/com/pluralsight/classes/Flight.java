package com.pluralsight.classes;

public class Flight {
		
		private int passengers;			//Fields of the class
		private int seats;
		
		public Flight() {				//Constructor of the class
			seats = 150;
			passengers = 0;	
		}
		
		/*
		 * Using Classes section
		 * **/
		
		public void add1passenger() {	//Method of the class that can be used outside the class
			if (passengers < seats)
				passengers += 1;
			else
				handleTooMany();
		}
		
		public void printpassengers() {
			System.out.println(passengers);
		}
		
		private void handleTooMany() {	//Method of the class that cannot be used outside the class
			System.out.println("Too Many!");
		}
		
		/*
		 * Method return Values section
		 * **/
		
		public boolean hasRoom (Flight f2) {
			int total = passengers + f2.passengers;
			return (total <= seats);		// If total is < or Equal to seats true, else false 
		}
		
		public Flight createNewWithBoth (Flight f2) {
			Flight newFlight = new Flight();
			newFlight.seats = seats;
			newFlight.passengers = this.passengers + f2.passengers;		// this here refers to the current object
			
			/*
			 * Special references this:
			 * 		since the method createNewWithBoth is called:
			 * 			lax1.createNewWitBoth(lax2);
			 * 				this.passengers is refering to the passengers of the object lax1
			 * 					f2.passengers is refered to the passengers of the object f2
			 * */
			
			return newFlight;
		}
		
}
