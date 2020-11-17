package com.epam.tasks3loops;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long a;
		long b;
		
		System.out.print("Enter two integers separated by a space: ");
		a = scanner.nextInt();
		b  = scanner.nextInt();
		scanner.close();

		System.out.print("The numbers that make up the integer a: ");
		while (a!=0) {
			System.out.print(a%10 + " ");   //return the remainder after dividing a by 10
			a/=10;                          //remove unnecessary part of the number
		}
		System.out.println();
		System.out.print("The numbers that make up the integer b: ");
		while (b!=0) {
			System.out.print(b%10 + " ");
			b/=10;
		}
	}
}
