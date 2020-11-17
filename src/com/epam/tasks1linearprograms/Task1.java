package com.epam.tasks1linearprograms;

import java.util.Scanner;

public class Task1 {

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
        
        System.out.println("Calculate function falue: z = ((a-3)*b/2)+c ...");
        System.out.println("z = " +(((a-3)*b/2)+c));
        
    }
}
