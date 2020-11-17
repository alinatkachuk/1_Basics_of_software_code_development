package com.epam.tasks1linearprograms;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t;     //number of seconds entered by user
		int h=0;   // number of hours	
		int m=0;   // number of minutes
		
		System.out.print("Enter a natural number of the elapsed time in seconds T: ");
		t = scanner.nextInt();
		scanner.close();
		
		if (t<=0) {
			System.out.println("You entered the wrong number format");
		}
		else {
		while (t>=3600) {
			t=t-3600;
			h++;
			}
		while (t>=60) {
		    t=t-60;
		    m++;
			}
		
		System.out.format("%02dh", h);
		System.out.format("%02dm", m);
	    System.out.format("%02ds", t);	
	    System.exit(0);
		}
    }		
}
