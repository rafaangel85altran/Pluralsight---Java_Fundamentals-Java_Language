package com.pluralsight.variablescope;

public class Main {
	
	public static void main (String[] args) {
		
		float students = 30.0f;
		float rooms = 4.0f;
		
		if (rooms > 0) {
			System.out.println(students);
			System.out.println(rooms);
			float avg = students / rooms;
			
			System.out.println(avg);
		}
		
		/*
		 * If I try to access the variable avg here it will be impossible because
		 * is outside of scope
		 * 			System.out.println(avg);
		 * */
	}

}
