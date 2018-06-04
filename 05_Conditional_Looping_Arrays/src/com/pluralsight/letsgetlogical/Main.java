package com.pluralsight.letsgetlogical;

public class Main {
	
	public static void main (String[] args) {
		
		int students = 150;
		int rooms = 0;
		
		if (rooms > 0 && students / rooms > 30)		//One "&" will make both logical operations
													//But "&&" will make only the first logicla op
			System.out.println("crowded");
		
		System.out.println();
		System.out.println("** end program **");
	}

}
