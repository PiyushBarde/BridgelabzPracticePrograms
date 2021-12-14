package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int previousNumber = 0;
		int currentNumber = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to which u want Fibonacci Series = " );
		int fibonacciSeries = sc.nextInt();
		System.out.print("Fibonacci Series for " + fibonacciSeries + " = " + previousNumber + " ," + currentNumber);
				for (int i=2; i<fibonacciSeries; i++) {
				int nextNumber = currentNumber + previousNumber;
				previousNumber = currentNumber;
				currentNumber = nextNumber;
				System.out.print(" ," + nextNumber);
			}
		
	}

}
