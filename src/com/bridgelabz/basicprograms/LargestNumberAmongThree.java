package com.bridgelabz.basicprograms;
import java.util.Scanner;
public class LargestNumberAmongThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Numbers : ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is largest number");
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is largest number");
		}
		else {
			System.out.println(num3 + " is largest number");
		}
	}

}
