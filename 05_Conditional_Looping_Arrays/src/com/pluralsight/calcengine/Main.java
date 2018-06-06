package com.pluralsight.calcengine;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		double [] vals = {0, 0};
		double val1 = 0;
		double val2 = 0;
		double result = 0;
		
		/**Object operation class pointing at the class Operation
		 * **/
		Operation operation1 = new Operation();
		Representation representation1 = new Representation();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("############## Welcome to the Calculator ##############");
		System.out.println("############## Choose wether to calculate #############");
		System.out.println("##############             a + b         ##############");
		System.out.println("##############             a - b         ##############");
		System.out.println("##############             a * b         ##############");
		System.out.println("##############             a / b         ##############");
		System.out.println("############  enter the desired operator   ############");
		
		char opCode = keyboard.nextLine().charAt(0);
	
		switch (opCode) {
		
			case '+':
			{
				
				System.out.println("Type first operand");
				vals[0] = keyboard.nextDouble();
				
				System.out.println("Type second operand");
				vals[1] = keyboard.nextDouble();
				
				result = operation1.addition(vals[0], vals[1]);
				
				representation1.printOp(vals[0], vals[1], result, opCode);
				
				break;
			}
			
			case '-':
			{
				System.out.println("Type first operand");
				vals[0] = keyboard.nextDouble();
				
				System.out.println("Type second operand");
				vals[1] = keyboard.nextDouble();
				
				result = operation1.substraction(vals[0], vals[1]);
				
				representation1.printOp(vals[0], vals[1], result, opCode);
				
				break;
			}
			
			case '*':
			{
				System.out.println("Type first operand");
				vals[0] = keyboard.nextDouble();
				
				System.out.println("Type second operand");
				vals[1] = keyboard.nextDouble();
				
				result = operation1.multiplication(vals[0], vals[1]);
				
				representation1.printOp(vals[0], vals[1], result, opCode);
				
				break;
			}
			
			case '/':
			{
				System.out.println("Type first operand");
				vals[0] = keyboard.nextDouble();
				
				System.out.println("Type second operand");
				vals[1] = keyboard.nextDouble();
				
				result = operation1.divition(vals[0], vals[1]);
				
				if (result != 0) {
					representation1.printOp(vals[0], vals[1], result, opCode);
					break;
				}
				else
					break;
			}
			
			default: 
				System.out.println("This operand is not permitted");
		}
		System.out.println("End of the program");
	}
}
