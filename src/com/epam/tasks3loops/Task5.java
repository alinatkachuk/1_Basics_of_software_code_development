package com.epam.tasks3loops;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n;
		double e;
	    double a;
		double s=0;
		
		System.out.print("Enter the number e (comma-separated): ");
		e = scanner.nextDouble();
		System.out.print("Enter the amount of numbers in the number row (n):");
		n = scanner.nextInt();
		scanner.close();
		
		if (n>0) {
	        for (int i=1; i<=n; i++) {
	        	a=((1/(Math.pow(2, i))))+(1/(Math.pow(3, i)));
	            if (Math.abs(a)>=e) {
	            	s=s+a;
	            }
	        }
	        System.out.print("The sum of numbers from a number series according to the condition: " +s);
		}
		else {
			System.out.print("Invalid format for number n");
		}
	}
}
