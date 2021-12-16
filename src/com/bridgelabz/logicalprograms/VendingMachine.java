package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Total price of product bought = ");
		int boughtItemsAmount = sc.nextInt();
		System.out.println("Money given to vending machine = ");
		int moneySentInVendingMachine = sc.nextInt();
		int amount = moneySentInVendingMachine - boughtItemsAmount;
		System.out.println("Money to be return as change = ");
		int counterThousand = 0;
		int counterFiveHundread = 0;
		int counterHundread = 0;
		int counterFifty = 0;
		int counterTen = 0;
		int counterFive = 0;
		int counterTwo = 0;
		int counterOne = 0;
		
		while(amount>=1000) 
		{
			amount=amount-1000;
			counterThousand++;
		}
		
		while(amount>=500) 
		{
			amount=amount-500;
			counterFiveHundread++;
		}
		
		while(amount>=100) 
		{
			amount=amount-100;
			counterHundread++;
		}
	
		while(amount>=50) 
		{
			amount=amount-50;
			counterFifty++;
		}
		
		while(amount>=10) 
		{
			amount=amount-10;
			counterTen++;
		}
		
		while(amount>=5) 
		{
			amount=amount-5;
			counterFive++;
		}
		
		while(amount>=2) 
		{
			amount=amount-2;
			counterTwo++;
		}
		
		while(amount>=1) 
		{
			amount=amount-1;
			counterOne++;
		}
		System.out.println("minimum required notes are : ");
		if(counterThousand!=0)
			{
				System.out.println(counterThousand +" notes of 1000");
			}
		if(counterFiveHundread!=0)
		{
			System.out.println(counterFiveHundread +" notes of 500");
		}
		if(counterHundread!=0)
		{
			System.out.println(counterHundread +" notes of 100");
		}
		if(counterFifty!=0)
		{
			System.out.println(counterFifty +" notes of 50");
		}
		if(counterTen!=0)
		{
			System.out.println(counterTen +" notes of 10");
		}
		if(counterFive!=0)
		{
			System.out.println(counterFive +" notes of 5");
		}
		if(counterTwo!=0)
		{
			System.out.println(counterTwo +" notes of 2");
		}
		if(counterOne!=0)
		{
			System.out.println(counterOne +" notes of 1");
		}
		}

	}
