package com.epam.tasks1linearprograms;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double x,y;
		
		System.out.print("Enter the value of the angle x (comma-separated): ");
		x = scanner.nextDouble();

		System.out.print("Enter the value of the angle y (comma-separated): ");
		y = scanner.nextDouble();
		
		scanner.close();
        
        System.out.println("Calculate this expression...");
        System.out.println("Received answer: " +((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y)));
        
	}
}
