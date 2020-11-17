package com.epam.tasks1linearprograms;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x;    
		int y;   
		
		System.out.print("Enter the coordinate value of the point along the 0x: ");
		x = scanner.nextInt();
		System.out.print("Enter the coordinate value of the point along the 0y: ");
		y = scanner.nextInt();
		scanner.close();
		
		if ((y>0) && (y<=4)) {              // check points that are above 0x axis
			if ((x>=-2) && (x<=2)) {
				System.out.println("true");
			}
		}
		
		else if ((y>=-3) && (y<=0)) {       // check points that are below 0x axis (including 0x)
				if ((x>=-4) && (x<=4)) {
					System.out.println("true");
				}
		}
		
		else {
			System.out.println("false");
			
		}
	}
}
