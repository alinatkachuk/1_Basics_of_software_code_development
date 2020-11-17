package com.epam.tasks3loops;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int m;
		int n;
		
		System.out.print("Enter m and n from the interval [m, n] separated by a space:");
		m = scanner.nextInt();
		n  = scanner.nextInt();
		scanner.close();
		
		if (m>n) {
			System.out.print("Invalid format of the interval (a> b)");
		}
		else {
	    	for (int i=m; i<=n; i++) {
	    		System.out.print(i + ": ");
	    		for (int k=2; k<=i-1; k++) {   //so that there're all divisors except 1 and the number
	    			if (i%k!=0) {
	    				System.out.print("");
	    			}
	    			else {
	    				System.out.print(k+" ");
	    			}
		     	}
	    		System.out.println();
		    }
		}
	}
}
