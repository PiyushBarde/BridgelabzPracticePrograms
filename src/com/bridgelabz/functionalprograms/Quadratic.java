package com.bridgelabz.functionalprograms;
import java.util.Scanner;
public class Quadratic {
	
	static void quadSolution(double subaValue, double subbValue, double subcValue) {
		
		double firstValueOfX = ((-subbValue + Math.sqrt((subbValue*subbValue)-(4*subaValue*subcValue)))/(2*subaValue));
		double secondValueOfX = ((-subbValue - Math.sqrt((subbValue*subbValue)-(4*subaValue*subcValue)))/(2*subaValue));
		
		System.out.println("First root of x = " + firstValueOfX);
		System.out.println("second root of x = " + secondValueOfX);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a = ");
		double aValue = sc.nextDouble();
		System.out.println("Enter the value of b = ");
		double bValue = sc.nextDouble();
		System.out.println("Enter the value of c = ");
		double cValue = sc.nextDouble();
		System.out.println("Quadratic equation is = " + aValue + "*x*x + " + bValue + "*x + " + cValue);
		quadSolution(aValue, bValue, cValue);
	}

}
