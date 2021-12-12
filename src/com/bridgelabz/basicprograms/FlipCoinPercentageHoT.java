package com.bridgelabz.basicprograms;
import java.util.Scanner;
public class FlipCoinPercentageHoT {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many times u want to flip coin : ");
		double flip = sc.nextInt();
			if( flip < 0 ) {
				System.err.println("Run the program agin & Enter positive integer");
				System.exit(0);
			}
		double tails=0;
		double heads=0;
		for (int i=1; i<=flip; i++) {
			double side = Math.random();
			if( side < 0.5) {
				tails=tails+1;
				System.out.println("Tails");
			}
			else {
				heads=heads+1;
				System.out.println("Heads");
			}
		}
		double percentageOfHeads = (heads / flip)*100;
		double percentageOfTails = 100 - percentageOfHeads;
		System.out.println("Percentage Of Heads = " + percentageOfHeads);
		System.out.println("Percentage Of Tails = " + percentageOfTails);
	}

}
