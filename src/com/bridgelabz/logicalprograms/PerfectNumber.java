package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check if it is perfect = ");
		int perfectNumber = sc.nextInt();
		int sumOfDivisor = 0;
		
		for(int i=1; i<=perfectNumber/2; i++)
		{
			if(perfectNumber%i==0)
			{
				sumOfDivisor = sumOfDivisor + i;
			}
		}
		if(sumOfDivisor==perfectNumber)
		{
			System.out.println(perfectNumber + " is the perfect number");
		}
		else 
		{
			System.out.println(perfectNumber + " is not a perfect Number");
		}
			
	}

}
