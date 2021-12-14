package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		System.out.println("Enter number to check if it is prime");
		int number = sc.nextInt();
		for (int index=1; index<=number; index++) {
				if (number%index==0) {
					counter=counter+1;
				}
			}
		if (counter==2) {
			System.out.println(number + " is a prime number");
		}
		else {
			System.out.println(number + " is not a prime number");
		}
	}
}
