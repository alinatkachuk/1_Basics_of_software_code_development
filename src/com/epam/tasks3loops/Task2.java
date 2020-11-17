package com.epam.tasks3loops;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int h;
		int a;
		int b;
		
		System.out.print("Enter a and b from the interval [a, b] separated by spaces: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		if (a>b) {
			System.out.print("Invalid format for the interval (a> b) ");
		}
		else {
		    System.out.print("Enter step value h: ");
		    h = scanner.nextInt();
		    scanner.close();
		
	      	System.out.println("The solution to this function: ");
	    	for (int i=a; i<=b; i=i+h) {
		     	if (i>2) {
				System.out.print(i+" ");
		     	}
		    	else {
				System.out.print((-i)+" ");
			    }
		    }
		}
	}
}
