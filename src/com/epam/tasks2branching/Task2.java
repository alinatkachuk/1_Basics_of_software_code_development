package com.epam.tasks2branching;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		
		System.out.print("Enter integers a, b, c, d separated by a space: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		scanner.close();
		
        if (Math.min(a, b)>Math.min(c, d)) {
        	System.out.print("Answer: " +Math.min(a, b));
        }
        else {
        	System.out.print("Answer: " +Math.min(c, d));
        }
	}

}
