package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class PrimeFactorizationOfN {

	public static void main(String[] args) {
			          Scanner input = new Scanner(System.in);
			          System.out.println("Enter number to find its factor :");
			          int num = input.nextInt();
				          for (int i = 2; i * i <= num; i++) {
				            while (num%i==0){
				                num=num/i;
				                System.out.print(i + " * ");
				            		}
				          		}
					        if(num != 1){
					            System.out.print(num);
					        	}
			  }	
	}