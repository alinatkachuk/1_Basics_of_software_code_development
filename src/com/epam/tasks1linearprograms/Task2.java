package com.epam.tasks1linearprograms;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double a,b,c;
		
		System.out.print("Enter the integer a (comma-separated): ");
		a = scanner.nextDouble();

		System.out.print("Enter the integer b (comma-separated): ");
		b = scanner.nextDouble();
		
		System.out.print("Enter the integer c (comma-separated): ");
		c = scanner.nextDouble();
		
		scanner.close();
        
        System.out.println("Calculate the value of this expression ...");
        System.out.println("Received answer: " +((b+Math.sqrt(Math.pow(b, 2)+4*a*c)/(2*a))-(Math.pow(a, 3)*c)+Math.pow(b, -2)));
        
	}
}
