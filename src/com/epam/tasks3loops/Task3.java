package com.epam.tasks3loops;

public class Task3 {

	public static void main(String[] args) {
		
		int s=0;
		
		for (int i=1; i<=100; i++) {
		    s=s+(i*i);
		}
		
		System.out.print("Sum of the squares of the first 100 numbers: " +s);

	}
}
