package com.epam.tasks3loops;

import java.math.BigInteger;

public class Task4 {

	public static void main(String[] args) {

        BigInteger s= BigInteger.valueOf(1);
		
		for (int i=2; i<=200; i++) {
		    s=s.multiply(BigInteger.valueOf((long)i*i));
		}
		
		System.out.print("The product of the squares of the first two hundred numbers: " +s);
		
	}
}