package com.epam.tasks3loops;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x;
		int a=0;
		
		System.out.print("Enter any positive integer: ");
		x = scanner.nextInt();
		scanner.close();
		
		for (int i=1; i<=x; i++) {
		    a=a+i;
		}
		System.out.print("The sum of the numbers from 1 to the entered integer is:" +a);
	}

}
