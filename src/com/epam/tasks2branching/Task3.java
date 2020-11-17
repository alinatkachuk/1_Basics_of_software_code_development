package com.epam.tasks2branching;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
		int line;
		
		System.out.print("Enter the coordinates of point A with a space (integers): ");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		System.out.print("Enter the coordinates of point B with a space (integers): ");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		System.out.print("Enter the coordinates of point C with a space (integers): ");
		x3 = scanner.nextInt();
		y3 = scanner.nextInt();
		scanner.close();
		
		line = (x1-x3)*(y2-y3)-(x2-x3)*(y1-y3);  // (x1-x3)*(y2-y3)=(x2-x3)*(y1-y3) - the equation of the line
		
		switch (line) {
		case 0:
        	System.out.print("Points A, B and C are collinear");
        	break;
        default:
        	System.out.print("Points A, B and C are not collinear");
        	break;
        }
	}
}
