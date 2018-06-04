package com.pluralsight.calcengine;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		double val1 = 0;
		double val2 = 0;
		double result = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("############## Welcome to the Calculator ##############");
		System.out.println("############## Choose wether to calculate #############");
		System.out.println("##############             a + b         ##############");
		System.out.println("##############             a - b         ##############");
		System.out.println("##############             a * b         ##############");
		System.out.println("##############             a / b         ##############");
		System.out.println("############  enter the desired operator   ############");
		
		char opCode = keyboard.nextLine().charAt(0);
		
		if (opCode == '+') {
			System.out.println("Type first operand");
			val1 = keyboard.nextDouble();
			
			System.out.println("Type second operand");
			val2 = keyboard.nextDouble();
			
			System.out.println("Result is");
			System.out.println(val1 + val2);
		}
		else if (opCode == '-') {
			System.out.println("Type first operand");
			val1 = keyboard.nextDouble();
			
			System.out.println("Type second operand");
			val2 = keyboard.nextDouble();
			
			System.out.println("Result is");
			System.out.println(val1 - val2);
		}
		else if (opCode == '*') {
			System.out.println("Type first operand");
			val1 = keyboard.nextDouble();
			
			System.out.println("Type second operand");
			val2 = keyboard.nextDouble();
			
			System.out.println("Result is");
			System.out.println(val1 * val2);
		}
		else if (opCode == '/') {
			System.out.println("Type first operand");
			val1 = keyboard.nextDouble();
			
			System.out.println("Type second operand");
			val2 = keyboard.nextDouble();
			
			System.out.println("Result is");
			System.out.println(val1 / val2);
		}
		
	}

}
