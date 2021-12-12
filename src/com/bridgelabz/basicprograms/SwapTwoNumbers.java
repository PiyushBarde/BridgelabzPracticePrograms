package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first Number : ");
		int num1 = input.nextInt();
		System.out.println("Enter Second Number : ");
		int num2 = input.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Numbers After Swap");
		System.out.println("first number :" + num1);
		System.out.println("Second number :" + num2);
	}

}
