package com.epam.tasks2branching;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a;  
		int b;  
		int x;  
		int y;  
		int z; 
		
		System.out.print("Enter the dimensions of the rectangular hole A and B separated by spaces (integers):");
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.print("Enter the dimensions of the brick a, b and z, separated by spaces (integers): ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		scanner.close();
		
		int hole = a*b;
		int brick1 = x*y;
		int brick2 = x*z;
		int brick3 = z*y;
		
        if (hole>=brick1) {
        	System.out.println("The brick will go through the hole");
		}
        else if (hole>=brick2) {
        	System.out.println("The brick will go through the hole");
        }
        else if (hole>=brick3){
        	System.out.println("The brick will go through the hole");
        }
        else {
        	System.out.println("Brick won't go through the hole");
        }
	}
}
