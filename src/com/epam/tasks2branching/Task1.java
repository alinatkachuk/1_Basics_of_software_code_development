package com.epam.tasks2branching;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		
		System.out.print("Enter the value of the first angle of the triangle (in degrees): ");
		a = scanner.nextInt();
		System.out.print("Enter the value of the second angle of the triangle (in degrees) ");
		b = scanner.nextInt();
		scanner.close();
		
		int c = 180-(a+b);
		
		if ((a+b)<180) {
			System.out.println("A triangle with such angles exists");
			
			switch (a) {
			case 90:
				System.out.println("Triangle is right-angled");
				break;
		    }
			
			switch (b) {
			case 90:
				System.out.println("Triangle is right-angled");
				break;
		    }
			
			switch (c) {
			case 90:
				System.out.println("Triangle is right-angled");
				break;
			default:
				System.out.println("Triangle is not right-angled");
		    }
		}
		
		else {
			System.out.println("There is no triangle with such angles");
			
		}
	}
}
