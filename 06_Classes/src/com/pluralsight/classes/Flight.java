package com.pluralsight.classes;

public class Flight {
		
		private int passengers;			//Fields of the class
		private int seats;
		
		public Flight() {				//Constructor of the class
			seats = 150;
			passengers = 0;	
		}
		
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
}
