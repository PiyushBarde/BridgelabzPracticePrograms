package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class QuotientAndRemainderCompute {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Divident : ");
		int Divident = input.nextInt();
		System.out.println("Enter Divisor : ");
		int Divisor = input.nextInt();
		double quotient = Divident/Divisor;
		System.out.println("Quotient : "  + quotient);
		double remainder = Divident%Divisor;
		System.out.println("Remainder : "  + remainder);
	}

}
