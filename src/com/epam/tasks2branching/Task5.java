package com.epam.tasks2branching;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double x;  
		
		System.out.print("Enter number x (if fractional - separated by commas): ");
		x = scanner.nextDouble();
		scanner.close();
		
		if (x<=3) {
		    System.out.print("The value of this function: " +(Math.pow(x, 2)-(3*x)+9));
		}
		else {
			System.out.print("The value of this function: " +(1/(Math.pow(x, 3)+6)));
		}
	}
}
