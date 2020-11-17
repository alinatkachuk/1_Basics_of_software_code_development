package com.epam.tasks1linearprograms;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double a;
		
		System.out.print("Enter any real number of the format nnn.ddd (comma-separated): ");
		a = scanner.nextDouble();
		scanner.close();
        
		String[] splitter = String.valueOf(a).split("\\.");
		int i = splitter[1].length();
		
		if (i==3) {
			if ((a>99) && (a<1000)) {
				
				String[] x = String.valueOf(a).split("[.]");
				int inta = Integer.parseInt(x[0]);
				int fraca = Integer.parseInt(x[1]);
				double inta1 = inta;
				
				System.out.println("ddd.nnn = " +(fraca+(inta1/1000)));
			}
			else {
				System.out.println("You entered more than three n");
			}
	    }
	}
}
