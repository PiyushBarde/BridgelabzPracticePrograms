package com.bridgelabz.functionalprograms;
import java.util.Scanner;
public class EuclideanDistanceCalculation {
	static void distanceCalculator(int subxValue, int subyValue) {
		double distance = Math.sqrt(subxValue* subxValue + subyValue * subyValue);
		System.out.println("Euclidean Distance from (0,0) to " +"("+subxValue+","+ subyValue+") = "+ distance + " Unit");
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter co-ordinates of x = ");
	int xValue = sc.nextInt();
	System.out.println("Enter co-ordinates of x = ");
	int yValue = sc.nextInt();
	distanceCalculator(xValue, yValue);
	}

}
