package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse it = ");
		int number = sc.nextInt();
		int reverseNumber = 0;
		int remainder = 0;
		while(number!=0) {
			remainder=number%10;
			reverseNumber=(reverseNumber*10)+remainder;
			number=number/10;
		}
		System.out.println("The reverse number of " + reverseNumber);
		
	}

}
