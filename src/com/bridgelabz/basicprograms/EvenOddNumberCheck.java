package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class EvenOddNumberCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to check if it is even or odd : ");
		int num = input.nextInt();
			if( num%2==0 ) {
				System.out.println("Number is Even");
			}
			else {
				System.out.println("Number is Odd");
			}
	}
}
